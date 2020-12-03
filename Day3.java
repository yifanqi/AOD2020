package com.yifan.day3;

import java.io.*;

public class Day3 {

    private static final File mapFile = new File("/Users/yifanqi/Desktop/AdventOfCode2020/src/com/yifan/day3/Map");


    public static void main(String[] args) {

        int right1Down1 = rightADownB(1,1);
        int right3Down1 = rightADownB(3,1);
        int right5Down1 = rightADownB(5,1);
        int right7Down1 = rightADownB(7,1);
        int right1Down2 = rightADownB(1,2);

        int finalResult = right1Down1 * right3Down1 * right5Down1 * right7Down1 * right1Down2;

        System.out.println(finalResult);

    }

    private static int rightADownB(int a, int b) {
        int index = 0;
        int numOfTrees = 0;
        int lineLength;
        int numOfDownLines = b;
        String line;


        try (BufferedReader br = new BufferedReader(new FileReader(mapFile))) {

            while ((line = br.readLine()) != null) {
                lineLength = line.length();

                if (line.charAt(index) == '#') {
                    numOfTrees++;
                }

                if ((index+a) >= line.length() && index != lineLength-1) {
                    index = ((index + a) - lineLength);
                } else if (index == lineLength-1) {
                    index = a-1;
                } else {
                    index += a;
                }

                while(numOfDownLines>1) {
                    br.readLine();
                    numOfDownLines--;
                }

                numOfDownLines = b;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return numOfTrees;

    }
}
