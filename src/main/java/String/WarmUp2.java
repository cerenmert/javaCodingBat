package String;

import BaseClass.BaseClass;

/*
Given a string, return a new string where the first and last chars have been exchanged.
frontBack("code") → "eodc"
*/
public class WarmUp2 extends BaseClass {
    public static void main(String[] args) {
        WarmUp2 warmUp2 = new WarmUp2();
        String actualWord = warmUp2.frontBack("code");
        String expectedWord = "eodc";
        BaseClass.isTestPassed(actualWord, expectedWord);

        String actualWord2 = warmUp2.frontBack("a");
        String expectedWord2 = "a";
        BaseClass.isTestPassed(actualWord2, expectedWord2);

        String actualWord3 = warmUp2.frontBack("ab");
        String expectedWord3 = "ba";
        BaseClass.isTestPassed(actualWord3, expectedWord3);

        String actualWord4 = warmUp2.frontBack("");
        String expectedWord4 = "";
        BaseClass.isTestPassed(actualWord4, expectedWord4);
    }

    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String x = str.substring(0, 1);
        //x = str.charAt(0)
        String y = str.substring(1, str.length() - 1);
        //y = str.substring(1, str.length()-1);
        String z = str.substring(str.length() - 1, str.length());
        //z = str.charAt(str.length()-1)
        if (str.length() == 2) {
            return z + x;
        } else {
            return z + y + x;
        }
    }

}
