/*
Return true if the given string contains between 1 and 3 'e' chars.
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class WarmUp6 extends BaseClass {
    public static void main(String[] args) {
        WarmUp6 warmUp6 = new WarmUp6();
        Boolean actual = warmUp6.stringE("Hello");
        isTestPassed(actual, true);
        Boolean actual1 = warmUp6.stringE("Helle");
        isTestPassed(actual1, true);
        Boolean actual2 = warmUp6.stringE("Hellee");
        isTestPassed(actual2, false);
        Boolean actual3 = warmUp6.stringE("e");
        isTestPassed(actual3, true);
        Boolean actual4 = warmUp6.stringE("");
        isTestPassed(actual4, false);
    }

    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }
}
