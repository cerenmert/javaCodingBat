package BaseClass;

public class BaseClass {

    public static void isTestPassed(Object actual, Object expected) {
        System.out.println(actual.equals(expected) ? "PASSED" : "FAILED");
    }
}
