package com.baiTap.optional;

import java.util.Scanner;

public class AlgorithmComplexity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String inputString = scanner.nextLine();
        int[] chars = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = inputString.charAt(i);
            chars[ascii]++;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++)
            if (chars[j] > max) {
                max = chars[j];
                character = (char) j;
            }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
