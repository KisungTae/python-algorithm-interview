package com.company.stringmanipulation;

import java.util.*;

// review the java answer that is faster than 97% of java submission in discussion

public class MostCommonWord_R {
    public MostCommonWord_R() {
    }












































    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = removeNonWords(paragraph);
        Map<String, Integer> wordCounts = new HashMap<>();
        Set<String> bannedWords = new HashSet<>();
        String[] words = paragraph.split(" ");

        for (String bannedWord : banned) {
            bannedWords.add(bannedWord.toLowerCase());
        }

        for (String word : words) {
            if (word.isEmpty()) continue;
            if (!bannedWords.contains(word)) {
                Integer count = wordCounts.get(word);
                if (count == null)
                    count = 0;
                count++;
                System.out.println(word + " : " + count);
                wordCounts.put(word, count);
            }
        }

        int max = 0;
        String maxWord = "";

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            if (count > max) {
                maxWord = word;
                max = count;
            }
        }

        return maxWord;
    }

    private String removeNonWords(String paragraph) {
        StringBuilder sb = new StringBuilder();
        for (char ch : paragraph.toCharArray()) {
            if (Character.isLetter(ch) || ch == ' ') {
                sb.append(Character.toLowerCase(ch));
            } else sb.append(' ');
        }
        return sb.toString();
    }
}
