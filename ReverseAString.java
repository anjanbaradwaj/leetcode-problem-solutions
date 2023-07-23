package com.leetcode.problems;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println("The reversed string is: " + reverseString(str));
    }

    private static String reverseString(String str) {
        int start = 0;
        int end = str.length() - 1;
        char [] arr = str.toCharArray();

        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}
