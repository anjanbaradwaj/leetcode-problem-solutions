package com.leetcode.problems;

public class MergeAlternately {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","efg"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();

        while (i < m || i < n) {
            if (i < m) {
                result.append(word1.charAt(i));
            }
            if (i < n) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}
