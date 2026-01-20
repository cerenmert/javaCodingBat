/*
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for
each different string, with the value the number of times that string appears in the array.
wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
wordCount([], {})
 */
package Map;

import BaseClass.BaseClass;

import java.util.HashMap;
import java.util.Map;

public class WordCount extends BaseClass {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "a", "c", "b"};
        Map<String, Integer> actual = wordCount2(strings);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        expected.put("c", 1);
        isTestPassed(actual, expected);

        String[] strings1 = {}; // empty array
        Map<String, Integer> actual1 = wordCount(strings1);
        Map<String, Integer> expected1 = new HashMap<>(); // empty map, so nothing to put
        isTestPassed(actual1, expected1);

        String[] strings2 = {"c", "c", "c", "c"};
        Map<String, Integer> actual2 = wordCount(strings2);
        Map<String, Integer> expected2 = new HashMap<>();
        expected2.put("c", 4);
        isTestPassed(actual2, expected2);

    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            //str has already seen in the map before
            if (map.containsKey(str)) {
                int count = map.get(str);
                map.put(str, count + 1);
                System.out.println(str + " count updated to " + (count + 1));
            }
            //str is seen first time in the map
            else {
                map.put(str, 1);
                System.out.println(str + " added to map with count 1");
            }
        }
        return map;
    }

    // More concise and professional version using getOrDefault
    public static Map<String, Integer> wordCount2(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            // Get the value of "str", if not existed, make it 0. Then add 1 to it and put it back to the map
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        return map;
    }
}
