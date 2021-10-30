package com.company.stringmanipulation;

// my answer is only 23% faster than the other java submission, review my answer and re-do

public class LongestPalindromeSubstring_R {
    public String longestPalindrome(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = 0; (j + i) < s.length(); j++) {
                if (isPalindrome(s, j, j + i)) {
                    return s.substring(j, j + i + 1);
                }
            }
        }
        return "";
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);

            if (startChar != endChar)
                return false;

            start++;
            end--;
        }


        return true;
    }
}
