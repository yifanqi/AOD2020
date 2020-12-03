package com.yifan.day1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Day1 {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        File inputFile = new File("/Users/yifanqi/Desktop/AdventOfCode2020/src/com/yifan/day1/input");
        Scanner scanner = new Scanner(inputFile);
        ArrayList input = new ArrayList();

        int i = 0;
        int a = 0, b = 0, c = 0;
        int finalResult;

        while (scanner.hasNextInt()) {
            input.add(scanner.nextInt());
            i++;
        }

        // Part 1
//        for (int index = 0; index < input.length; index++) {
//            a = input[index];
//            for (int j = index + 1; j < input.length; j++) {
//                if (a + input[j] == 2020) {
//                    b = input[j];
//                    finalResult = a * b;
//
//                    System.out.println(finalResult);
//                }
//            }
//        }

        // Part 2
        for (int index = 0; index < input.size(); index++) {
            a = (int) input.get(index);
            for (int j = index + 1; j < input.size(); j++) {
                for (int k = j + 1; k < input.size(); k++) {
                    if (a + (int) input.get(j) + (int) input.get(k) == 2020) {
                        b = (int) input.get(j);
                        c = (int) input.get(k);
                        finalResult = a * b * c;

                        System.out.println(finalResult);
                }

                }
            }
        }
    }
}

