import java.util.Arrays;

public class BaseClass {

    public static void isTestPassed(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }

    public static void isTestPassed(Boolean actual, Boolean expected) {
        if (actual.equals(expected)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
    public static void isTestPassed(Integer actual, Integer expected) {
        if (actual.equals(expected)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}
