package com.company.graph;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class LetterCombinationOfAPhoneNumber_R {

    // your solution was right but only faster than 10% java solution, review and rex`do it.

    public List<String> letterCombinations(String digits) {
        Map<Character, Character[]> letterMap = getLetterMap();
        List<String> results = new ArrayList<>();

        if (digits == null || digits.length() <= 0) {
            return results;
        }
        generateLetterCombnination(digits, 0, "", letterMap, results);

        return results;
    }

    private void generateLetterCombnination(String digits, int index, String prefix, Map<Character, Character[]> letterMap, List<String> results) {
        if (prefix.length() >= digits.length()) {
            results.add(prefix);
            return;
        }
        Character[] letters = letterMap.get(digits.charAt(index));

        for (char letter : letters) {
            generateLetterCombnination(digits, index + 1, prefix + letter, letterMap, results);
        }
    }

    private Map<Character, Character[]> getLetterMap() {
        Map<Character, Character[]> letters = new HashMap<>();
        letters.put('2', new Character[] {'a', 'b', 'c'});
        letters.put('3', new Character[] {'d', 'e', 'f'});
        letters.put('4', new Character[] {'g', 'h', 'i'});
        letters.put('5', new Character[] {'j', 'k', 'l'});
        letters.put('6', new Character[] {'m', 'n', 'o'});
        letters.put('7', new Character[] {'p', 'q', 'r', 's'});
        letters.put('8', new Character[] {'t', 'u', 'v'});
        letters.put('9', new Character[] {'w', 'x', 'y', 'z'});
        return letters;
    }
}
