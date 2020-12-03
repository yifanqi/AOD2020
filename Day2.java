package com.yifan.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {

    private static File inputFile = new File("/Users/yifanqi/Desktop/AdventOfCode2020/src/com/yifan/day2/input");

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(inputFile);

        int index = 0;
        String rangeStr = "";
        char givenLetter;
        String password = "";

        int minVal = 0, maxVal = 0;
        int repeatTime = 0;
        int finalResult = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner s = new Scanner(line);
            rangeStr = s.next();
            String[] ranges = rangeStr.split("-");


            minVal = Integer.valueOf(ranges[0]);
            maxVal = Integer.valueOf(ranges[1]);

            givenLetter = s.next().charAt(0);

            password = s.next();
            s.close();

            // Part 1
//            for(int i=0; i<password.length(); i++) {
//                if(password.charAt(i) == givenLetter) {
//                    repeatTime++;
//                }
//            }
//
//            if (repeatTime >= minVal && repeatTime <= maxVal) {
//                finalResult++;
//            }
//            repeatTime = 0;
//        }

            // Part 2
            if (((password.charAt(minVal - 1) == givenLetter || password.charAt(maxVal - 1) == givenLetter)) &&
            !(password.charAt(minVal - 1) == givenLetter && password.charAt(maxVal - 1) == givenLetter)) {
                finalResult++;
            }

        }

        System.out.println(finalResult);

    }
}
