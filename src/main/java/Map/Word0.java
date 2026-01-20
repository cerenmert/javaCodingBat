/*
Given an array of strings, return a Map<String, Integer> containing a key for every different string
in the array, always with the value 0. For example the string "hello" makes the pair "hello":0.

word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
word0(["c", "c", "c", "c"]) → {"c": 0}
word0([]) → {}
 */
package Map;

import BaseClass.BaseClass;

import java.util.HashMap;
import java.util.Map;

public class Word0 extends BaseClass {
    public static void main(String[] args) {
        Word0 obj = new Word0();
        String[] strings1 = {"a", "b", "a", "b"};
        Map<String, Integer> actual1 = obj.word0(strings1);
        Map<String, Integer> expected1 = Map.of("a", 0, "b", 0);
        // Not: Map.of içine sırasıyla key, value, key, value... şeklinde yazılır.
        /*
        Map.of kullanmadan böyle de yazılabilir:
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("a", 0);
        expectedMap.put("b", 0);
         */
        isTestPassed(actual1, expected1);

        String[] strings2 = {"a", "b", "a", "c", "b"};
        Map<String, Integer> actual2 = obj.word0(strings2);
        Map<String, Integer> expected2 = Map.of("a", 0, "b", 0, "c", 0);
        isTestPassed(actual2, expected2);

        String[] strings3 = {};
        Map<String, Integer> actual3 = obj.word0(strings3);
        Map<String, Integer> expected3 = Map.of();
        isTestPassed(actual3, expected3);

        String[] strings4 = {"c", "c", "c", "c"};
        Map<String, Integer> actual4 = obj.word0(strings4);
        Map<String, Integer> expected4 = Map.of("c", 0);
        isTestPassed(actual4, expected4);
    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, 0);
        }
        return map;
    }

}
