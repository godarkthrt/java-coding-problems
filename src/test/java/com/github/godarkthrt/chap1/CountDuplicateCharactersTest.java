package com.github.godarkthrt.chap1;


import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountDuplicateCharactersTest {

    CountDuplicateCharacters countDuplicateCharacters = new CountDuplicateCharacters();

    @Test
    void testDuplicateCharactersCount() {
        String name = "lalu";
//        Map<Character, Integer> characterIntegerMap = countDuplicateCharacters.countDuplicateCharacters(name);
        Map<Character, Long> characterIntegerMap = countDuplicateCharacters.countDuplicateCharactersUsingStreams(name);
        assertAll(
                () -> assertTrue(characterIntegerMap != null),
                () -> assertTrue(characterIntegerMap.get('l') == 2),
                () -> assertTrue(characterIntegerMap.get('a') == 1)
        );
    }

}