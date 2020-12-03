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
//        int numOfLines = 1;
        int lineLength;
        int numOfDownLines = b;
        String line;


        try (BufferedReader br = new BufferedReader(new FileReader(mapFile))) {

            while ((line = br.readLine()) != null) {
                lineLength = line.length();
//                System.out.println ("num of line: " + numOfLines + " num of index: " + index);

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
//                numOfLines+=b;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return numOfTrees;

    }

//    private static int right1Down1() {
//
//        int index = 0;
//        int numOfTreesCase1 = 0;
//        int numOfLines = 0;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(mapFile))) {
//            while ((line = br.readLine()) != null) {
//                System.out.println ("num of line: " + numOfLines + " num of index: " + index);
//
//                if (line.charAt(index) == '#') {
//                    numOfTreesCase1++;
//                }
//
//                if ((index+1) >= line.length()) {
//                    index = index % 1;
//                } else {
//                    index ++;
//                }
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return numOfTreesCase1;
//    }
//
//
//    private static int right3Down1() {
//
//        int index = 0;
//        int numOfTreesCase2 = 0;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(mapFile))) {
//            while ((line = br.readLine()) != null) {
////                System.out.println ("num of line: " + numOfLines + " num of index: " + index);
//
//                if (line.charAt(index) == '#') {
//                    numOfTreesCase2++;
//                }
//
//                if ((index+3) >= line.length() && index != line.length()-1) {
//                    index = ((index + 3) % 3 - 1);
//                } else if (index == line.length()-1) {
//                    index = 2;
//                } else {
//                    index += 3;
//                }
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        return numOfTreesCase2;
//    }
//
//    private static int right5Down1() {
//
//        int index = 0;
//        int numOfTreesCase3 = 0;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(mapFile))) {
//            while ((line = br.readLine()) != null) {
//                System.out.println ("num of index: " + index);
//
//                if (line.charAt(index) == '#') {
//                    numOfTreesCase3++;
//                }
//
//                if ((index+5) >= line.length() && index != line.length()-1) {
//                    index = ((index + 5) % 5 - 1);
//                } else if (index == line.length()-1) {
//                    index = 4;
//                } else {
//                    index += 5;
//                }
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        return numOfTreesCase3;
//    }
//
//    private static int right7Down1() {
//
//        int index = 0;
//        int numOfTreesCase4 = 0;
//        int numofLines = 1;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(mapFile))) {
//            while ((line = br.readLine()) != null) {
////                System.out.println ("num of lines: " + numofLines + " num of index: " + index);
//
//                if (line.charAt(index) == '#') {
//                    numOfTreesCase4++;
//                }
//
//                if ((index+7) >= line.length() && index != line.length()-1) {
//                    index = ((index + 7) - line.length());
//                } else if (index == line.length()-1) {
//                    index = 6;
//                } else {
//                    index += 7;
//                }
////                numofLines++;
//
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        return numOfTreesCase4;
//    }
//
//    private static int right1Down2() {
//
//        int index = 0;
//        int numOfTreesCase5 = 0;
//        int numOfLines = 1;
//        int numOfDownLines = 2;
////        String line;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(mapFile))) {
//
//            while ((line = br.readLine()) != null) {
////                System.out.println ("num of line: " + numOfLines + " num of index: " + index);
//
//                if (line.charAt(index) == '#') {
//                    numOfTreesCase5++;
//                }
//
//                if ((index+1) >= line.length()) {
//                    index = index % 1;
//                } else {
//                    index ++;
//                }
//
//                while (numOfDownLines > 1) {
//                    br.readLine();
//                    numOfDownLines--;
//                }
//
//                numOfDownLines = 2;
//                numOfLines += 2;
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        return numOfTreesCase5;
//    }


}
