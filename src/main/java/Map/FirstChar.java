/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first
character seen, with the value of all the strings starting with that character appended together
in the order they appear in the array.
firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
 */
package Map;

import BaseClass.BaseClass;

import java.util.HashMap;
import java.util.Map;

public class FirstChar extends BaseClass {
    public static void main(String[] args) {
        FirstChar firstChar = new FirstChar();
        String[] strings = {"salt", "tea", "soda", "toast"};
        Map<String, String> actual = firstChar.firstChar(strings);
        Map<String, String> expected = new HashMap<>();
        expected.put("s", "saltsoda");
        expected.put("t", "teatoast");
        isTestPassed(actual, expected);

    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            String firstChar = s.substring(0, 1);
            if (map.containsKey(firstChar)) { //Mapte "s" etiketi var mı? Evet (Az önce "salt" koyarken oluşturduk).
                String newWord = map.get(firstChar) + s;
                map.put(firstChar, newWord);
            } else {
                map.put(firstChar, s); //Mapte "s" etiketi yok. O zaman etiketi "s" olan kutuya "salt" koy.
            }
        }
        return map;
    }

}
