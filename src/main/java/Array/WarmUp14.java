package Array;

import BaseClass.BaseClass;

/*
Start with 2 int arrays, a and b, of any length. Return how many of the arrays are divisible by 2
as their first element.
Examples:
start1([2, 2, 3], [1, 3]) → 2
start1([8, 2, 3], [5]) → 1
start1([], []) → 0
*/
public class WarmUp14 extends BaseClass {
    public static void main(String[] args) {
        int[] a = {4, 2, 3};
        int[] b = {1, 3};
        int actual = countEvens(a, b);
        BaseClass.isTestPassed(actual, 1);

        int[] a1 = {8, 2, 3};
        int[] b1 = {2};
        int actual1 = countEvens(a1, b1);
        BaseClass.isTestPassed(actual1, 2);

        int[] a2 = {};
        int[] b2 = {};
        int actual2 = countEvens(a2, b2);
        BaseClass.isTestPassed(actual2, 0);

        int[] a3 = {};
        int[] b3 = {6, 4, 2};
        int actual3 = countEvens(a3, b3);
        BaseClass.isTestPassed(actual3, 1);

        int[] a4 = {};
        int[] b4 = {3, 4};
        int actual4 = countEvens(a4, b4);
        BaseClass.isTestPassed(actual4, 0);
    }

    public static int countEvens(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] % 2 == 0) {
            count++;
        }
        if (b.length > 0 && b[0] % 2 == 0) {
            count++;
        }
        return count;
    }
}
