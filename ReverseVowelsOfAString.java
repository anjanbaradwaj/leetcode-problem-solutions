package com.leetcode.problems;

import java.util.Scanner;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println("The string where only the vowels are reversed is: " + reverseVowels(str));
    }

    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;
        char[] arr = s.toCharArray();

        while (start < end) {
            while (start < end && !vowels.contains(arr[start] + "")) {
                start++;
            }
            while (start < end && !vowels.contains(arr[end] + "")) {
                end--;
            }
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}
