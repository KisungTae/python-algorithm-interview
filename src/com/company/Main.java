package com.company;

import com.company.linkedlist.PalindromeLinkedList;
import com.company.stringmanipulation.GroupAnagrams;
import com.company.stringmanipulation.MostCommonWord_R;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 5);
        Date newDate = calendar.getTime();
        System.out.println(date);
        System.out.println(newDate);

    }
}
