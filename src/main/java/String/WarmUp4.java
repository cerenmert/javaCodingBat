package String;

import BaseClass.BaseClass;

/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday, or we're on vacation. Return true if we sleep in.
sleepIn(false, false) → true
sleepIn(true, false) → false
 */
public class WarmUp4 extends BaseClass {
    public static void main(String[] args) {
        WarmUp4 warmUp4 = new WarmUp4();
        Boolean actual = warmUp4.sleepIn(false, false);
        BaseClass.isTestPassed(actual, true);
        Boolean actual2 = warmUp4.sleepIn(true, false);
        BaseClass.isTestPassed(actual2, false);
        Boolean actual3 = warmUp4.sleepIn(false, true);
        BaseClass.isTestPassed(actual3, true);
        Boolean actual4 = warmUp4.sleepIn(true, true);
        BaseClass.isTestPassed(actual4, true);
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;

        // return !weekday || vacation;
        // simplified version
    }
}
