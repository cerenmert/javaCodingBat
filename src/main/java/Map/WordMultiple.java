/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and
its value is true if that string appears 2 or more times in the array.
wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
wordMultiple([]) → {}
 */
package Map;

import BaseClass.BaseClass;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple extends BaseClass {
    public static void main(String[] args) {

        String[] words = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> actual = wordMultipleMidLevel(words); //{"a": true, "b": true, "c": false}
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", true);
        expected.put("c", false);
        isTestPassed(actual, expected);

        String[] words1 = {"a", "b", "c" };
        Map<String, Boolean> actual1 = wordMultipleSeniorLevel(words1); //{"a": false, "b": false, "c": false}
        Map<String, Boolean> expected1 = new HashMap<>();
        expected1.put("a", false);
        expected1.put("b", false);
        expected1.put("c", false);
        isTestPassed(actual1, expected1);
    }

    public static Map<String, Boolean> wordMultipleMidLevel(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String str : strings) {
            if (map.containsKey(str)) {
                map.put(str, true);
            } else {
                map.put(str, false);
            }
        }
        return map;
    }

    public static Map<String, Boolean> wordMultipleSeniorLevel(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, map.containsKey(s));
        }
        return map;
    }

}
