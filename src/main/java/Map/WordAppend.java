package Map;
/*
When a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "c"]) → ""
wordAppend(["a", "b", "b", "a", "a"]) → "ba"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["not", "and", "or", "and", "this", "and", "or", "that", "not"]) → "andornot"
wordAppend(["a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"]) → "baaba"
wordAppend(["a", "", "a"]) → "a"
 */

import BaseClass.BaseClass;

import java.util.HashMap;
import java.util.Map;

public class WordAppend extends BaseClass {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "b", "a", "a"};
        String actual = wordAppend(strings);
        String expected = "ba";
        isTestPassed(actual, expected);

        String[] strings1 = {"not", "and", "or", "and", "this", "and", "or", "that", "not"};
        String actual1 = wordAppend(strings1);
        String expected1 = "andornot";
        isTestPassed(actual1, expected1);

        String[] strings2 = {"a", "b", "a"};
        String actual2 = wordAppend(strings2);
        String expected2 = "a";
        isTestPassed(actual2, expected2);
    }

    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";
        for (String str : strings) {
            int count = 0;
            // -- Önce bu kelimenin mevcut sayısını bul --
            if (map.containsKey(str)) { // map'te "a" etiketi var mı?
                count = map.get(str); // varsa sayısını al
            }
            // -- Sayıyı 1 artır ve Map'e güncel halini yaz --
            count++;
            map.put(str, count); // "a" etiketini ve güncel sayısını map'e yaz
            // -- Eğer sayı çift ise (2, 4..), kelimeyi sonuca ekle --
            if (count % 2 == 0) {
                result = result + str; // sonucu güncelle
            }
        }
        return result;
    }

}
