/*
Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged.
Note: use .equals() to compare 2 strings.
notString("candy") → "not candy"
*/
public class WarmUp3 extends BaseClass {

    public static void main(String[] args) {
        WarmUp3 warmUp3 = new WarmUp3();
        String actualWord1 = warmUp3.notString("candy");
        String expectedWord1 = "not candy";
        isTestPassed(actualWord1, expectedWord1);

        String actualWord2 = warmUp3.notString("x");
        String expectedWord2 = "not x";
        isTestPassed(actualWord2, expectedWord2);

        String actualWord3 = warmUp3.notString("not bad");
        String expectedWord3 = "not bad";
        isTestPassed(actualWord3, expectedWord3);

        String actualWord4 = warmUp3.notString("no");
        String expectedWord4 = "not no";
        isTestPassed(actualWord4, expectedWord4);
    }

    public String notString(String str) {
        //str.length()>=3 && str.substring(0,3).equals("not")  yazmak yerine
        //str.startsWith("not") kullanmak daha temiz bir çözümdür.
        //IndexOutOfBoundsException hatalarından korur hem de gereksiz bellek kullanımı yapmaz.
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }
}
