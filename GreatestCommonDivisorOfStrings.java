package com.leetcode.problems;

public class GreatestCommonDivisorOfStrings {

    public static void main(String[] args) {
        String word1 = "ABCABCABC";
        String word2 = "ABC";
        System.out.println(" Greatest common divisor of given strings is : " + gcdOfStrings(word1, word2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcd = findGCD(m, n);
        return str1.substring(0, gcd);

    }

    public static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a%b);
    }
}
