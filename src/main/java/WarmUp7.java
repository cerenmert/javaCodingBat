/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
close10(8, 13) → 8
 */
public class WarmUp7 extends BaseClass {
    public static void main(String[] args) {
        WarmUp7 warmUp7 = new WarmUp7();
        int num = warmUp7.close10(8, 13);
        isTestPassed(num, 8);
        int num2 = warmUp7.close10(8, 12);
        isTestPassed(num2, 0);
        int num3 = warmUp7.close10(6, 10);
        isTestPassed(num3, 10);
        int num4 = warmUp7.close10(0, 20);
        isTestPassed(num4, 0);
    }

    public int close10(int a, int b) {
        int aDif = Math.abs(a - 10);
        int bDif = Math.abs(b - 10);
        if (aDif < bDif) return a;
        if (bDif < aDif) return b;
        return 0;
    }
}
