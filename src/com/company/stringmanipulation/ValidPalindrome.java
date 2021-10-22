package com.company.stringmanipulation;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {

    public ValidPalindrome() {
        List<Character> alphanumerics = new ArrayList<>();
        alphanumerics.add('a');
        alphanumerics.add('b');
        alphanumerics.add('c');

        System.out.println(alphanumerics);
    }

    public boolean isPalindrome(String s) {
        List<Character> alphanumerics = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch))
                alphanumerics.add(Character.toLowerCase(ch));
        }

        int left = 0;
        int right = alphanumerics.size() - 1;

        while (left <= right) {
            char leftChar = alphanumerics.get(left);
            char rightChar = alphanumerics.get(right);
            if (leftChar != rightChar) return false;

            left++;
            right--;
        }

        return true;
    }
}
