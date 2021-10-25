package com.company.stringmanipulation;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public void reverseString(char[] s) {
        int lastIndex = s.length - 1;
        int middleIndex = s.length / 2;
        if (s.length % 2 == 0) middleIndex--;

        for (int i = 0; i <= middleIndex; i++) {
            char temp = s[i];
            s[i] = s[lastIndex];
            s[lastIndex] = temp;
            lastIndex--;
        }
    }
}
