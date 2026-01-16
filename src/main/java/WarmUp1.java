/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string
(i.e. n will be in the range 0..str.length()-1 inclusive).
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
 */
public class WarmUp1 extends BaseClass {
    public static void main(String[] args) {
        WarmUp1 warmUp1 = new WarmUp1();
        String actualWord1 = warmUp1.missingChar("kitten", 1);
        String expectedWord1 = "ktten";
        isTestPassed(actualWord1, expectedWord1);

        String actualWord2 = warmUp1.missingChar("kitten", 0);
        String expectedWord2 = "itten";
        isTestPassed(actualWord2, expectedWord2);

        String actualWord3 = warmUp1.missingChar("kitten", 4);
        String expectedWord3 = "kittn";
        isTestPassed(actualWord3, expectedWord3);
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }
}
