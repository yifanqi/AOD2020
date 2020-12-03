package com.yifan.day2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day2RegEX {

    private static File inputFile = new File("/Users/yifanqi/Desktop/AdventOfCode2020/src/com/yifan/day2/input_bk");
    private static String line = "";

    public static void main(String[] args) {

        int minVal = 0, maxVal = 0;
        char givenLetter = 0;
        String password = "";

        int repeatTime = 0, finalResult = 0;

        Pattern pattern = Pattern.compile("(\\d+)-(\\d+) ([a-z]): ([a-z]+)");

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            while ((line = br.readLine()) != null) {
//                System.out.println(line);
                Matcher matcher = pattern.matcher(line);
                if(matcher.find()) {
                    minVal = Integer.parseInt(matcher.group(1));
                    maxVal = Integer.parseInt(matcher.group(2));
                    givenLetter = matcher.group(3).charAt(0);
                    password = matcher.group(4);
                }

                for(int i=0; i<password.length(); i++) {
                    if(password.charAt(i) == givenLetter) {
                        repeatTime++;
                    }
                }

                if (repeatTime >= minVal && repeatTime <= maxVal) {
                    finalResult++;
                }
                repeatTime = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(finalResult);

    }
}
