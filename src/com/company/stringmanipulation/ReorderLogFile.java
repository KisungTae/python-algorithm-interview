package com.company.stringmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReorderLogFile {

    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();
        List<String> orderedLogs = new ArrayList<>();

        for (String log : logs) {
            if (isDigitLog(log))
                digitLogs.add(log);
            else letterLogs.add(log);
        }

        letterLogs.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                String o1Content = getContent(o1);
                String o2Content = getContent(o2);

                if (o1Content.equals(o2Content)) {
                    String o1Id = getId(o1);
                    String o2Id = getId(o2);
                    return o1Id.compareTo(o2Id);
                }
                return o1Content.compareTo(o2Content);
            }
        });

        orderedLogs.addAll(letterLogs);
        orderedLogs.addAll(digitLogs);

        return orderedLogs.toArray(new String[0]);

    }

    private String getId(String log) {
        int startIndex = log.indexOf(' ');
        if (startIndex == -1) return log;
        else return log.substring(0, startIndex);
    }

    private String getContent(String log) {
        int startIndex = log.indexOf(' ');
        if (startIndex == -1) return "";
        else return log.substring(startIndex + 1);
    }

    private boolean isDigitLog(String log) {
        int startIndex = log.indexOf(' ');
        if (startIndex == -1) return false;
        startIndex++;
        if (startIndex >= log.length()) return false;
        char firstChar = log.charAt(startIndex);
        return Character.isDigit(firstChar);
    }
}
