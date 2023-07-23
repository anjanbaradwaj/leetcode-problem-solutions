package com.leetcode.problems;

public class GreatestCommonDivisorOfStrings {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2){
        int m = str1.length();
        int n = str2.length();

        if( !(str1+str2).equals(str2+str1) ){
            return "";
        }
        int gcd = findGCD(m, n);
        return str1.substring(0, gcd);
    }

    private static int findGCD(int m, int n) {
        return n == 0 ? m : findGCD(n, m % n);
    }
}
