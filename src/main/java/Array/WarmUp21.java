/*
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
If either array is length 0, ignore that array.
front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
front11([], [2, 8]) → [2]
front11([], []) → []
 */
package Array;

import BaseClass.BaseClass;

import java.util.Arrays;

public class WarmUp21 extends BaseClass {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] b1 = {7, 9, 8};
        int[] actual1 = front11(a1, b1);
        int[] expected1 = {1, 7};
        isTestPassed(Arrays.toString(actual1), Arrays.toString(expected1));

        int[] a2 = {1};
        int[] b2 = {};
        int[] actual2 = front11(a2, b2);
        int[] expected2 = {1};
        isTestPassed(Arrays.toString(actual2), Arrays.toString(expected2));

    }

    public static int[] front11(int[] a, int[] b) {
        // En yaygın/dolu senaryoyu başta aradan çıkar
        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};
        }

        // Sadece A doluysa
        if (a.length > 0) {
            return new int[]{a[0]};
        }

        // Sadece B doluysa
        if (b.length > 0) {
            return new int[]{b[0]};
        }

        // Her ikisi de boşsa
        return new int[0];
    }

}
