package com.github.godarkthrt.chap1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharacters {

    public Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character,Integer> charFrequencyCount = new HashMap<>();
        for (char ch: str.toCharArray()) {
            // prefer compute approach rather than first check with if and then put a value in map
            charFrequencyCount.compute(ch, (k,v) -> v == null? 1: v+1);
        }
        return charFrequencyCount;
    }

//    TODO check more on collectors and Java 8 stream api
    public Map<Character, Long> countDuplicateCharactersUsingStreams(String str) {
        return str.chars()
                .mapToObj(c -> Character.valueOf((char)c))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
