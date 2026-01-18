package String;

import BaseClass.BaseClass;

/*
Given a string, take the last char and return a new string with the last char added at the front and back,
The original string will be length 1 or more.
backAround("cat") → "tcatt"
 */
public class WarmUp5 extends BaseClass {
    public static void main(String[] args) {
        WarmUp5 warmUp5 = new WarmUp5();
        String actual = warmUp5.backAround("cat");
        BaseClass.isTestPassed(actual, "tcatt");
        String actual1 = warmUp5.backAround("hello");
        BaseClass.isTestPassed(actual1, "ohelloo");
        String actual2 = warmUp5.backAround("a");
        BaseClass.isTestPassed(actual2, "aaa");
    }

    public String backAround(String str) {
        String lastLetter = str.substring(str.length() - 1);
        if (str.length() == 1) {
            return str + str + str;
        } else if (str.length() == 2) {
            return str.charAt(1) + str + str.charAt(1);
        } else {
            return lastLetter + str + lastLetter;
        }
    }

}
