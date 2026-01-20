/*
Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.
pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
pairs(["a", "b"]) → {"a": "a", "b": "b"}
 */
package Map;

import BaseClass.BaseClass;

import java.util.HashMap;
import java.util.Map;

public class Pairs extends BaseClass {
    public static void main(String[] args) {
        Pairs obj = new Pairs();

        String[] strings = {"code", "bug", "hallo"};
        Map<String, String> actual = obj.pairs(strings);
        System.out.println("actual: " + actual);
        Map<String, String> expected = new HashMap<>();
        expected.put("c", "e");
        expected.put("b", "g");
        expected.put("h", "o");
        System.out.println("expected: " + expected);
        isTestPassed(actual, expected);

        String[] strings1 = {"code", "bug", "computer"};
        Map<String, String> actual1 = obj.pairs2(strings1);
        System.out.println("actual1: " + actual1);
        Map<String, String> expected1 = new HashMap<>();
        expected1.put("c", "r");
        expected1.put("b", "g");
        System.out.println("expected1: " + expected1);
        isTestPassed(actual1, expected1);

        String[] strings2 = {"man", "message", "motel", "music"};
        Map<String, String> actual2 = obj.pairs2(strings2);
        System.out.println("actual2: " + actual2);
        Map<String, String> expected2 = new HashMap<>();
        expected2.put("m", "c");
        System.out.println("expected2: " + expected2);
        isTestPassed(actual2, expected2);

        String[] strings3 = {"a", "b"};
        Map<String, String> actual3 = obj.pairs2(strings3);
        System.out.println("actual3: " + actual3);
        Map<String, String> expected3 = new HashMap<>();
        expected3.put("a", "a");
        expected3.put("b", "b");
        System.out.println("expected3: " + expected3);
        isTestPassed(actual3, expected3);

    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) { // str = "code"
            String firstChar = str.substring(0, 1);
            String lastChar = str.substring(str.length() - 1);
            map.put(str, lastChar); // {"code": "e"}
            if (map.containsKey(str)) {
                String newKey = map.remove(str);  // "e"
                map.put(firstChar, newKey);  // {"c": "e"}
            }
        }
        return map;
    }

    public Map<String, String> pairs2(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            String firstChar = str.substring(0, 1);
            String lastChar = str.substring(str.length() - 1);

            // Eğer aynı ilk harften (örneğin "man", "moon") gelirse,
            // map otomatik olarak eskisini silip son geleni yazar.
            map.put(firstChar, lastChar);
        }
        return map;
    }
}
