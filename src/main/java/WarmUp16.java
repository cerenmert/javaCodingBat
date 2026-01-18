import java.util.Arrays;

/*
Given two integer arrays, each of length 2, return a new array of length 4 containing all their elements.
plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
 */
public class WarmUp16 extends BaseClass {
    public static void main(String[] args) {
        int[] a3 = {1, 2, 5, 6, 7, 8, 8, 8, 9, 9, 9, 0};
        int[] b3 = {3, 4, 6, 3, 4, 5, 1, 9, 5, 6, 8};
        int[] actual3 = plusTwo(a3, b3);
        int[] expected3 = {1, 2, 5, 6, 7, 8, 8, 8, 9, 9, 9, 0, 3, 4, 6, 3, 4, 5, 1, 9, 5, 6, 8};
        isTestPassed(Arrays.toString(actual3), Arrays.toString(expected3));

        int[] a = {4, 2};
        int[] b = {1, 3};
        int[] actual = plusTwo2(a, b);
        int[] expected = {4, 2, 1, 3};
        isTestPassed(Arrays.toString(actual), Arrays.toString(expected));

        int[] a2 = {7, 7};
        int[] b2 = {3, 8};
        int[] actual2 = plusTwo3(a2, b2);
        int[] expected2 = {7, 7, 3, 8};
        isTestPassed(Arrays.toString(actual2), Arrays.toString(expected2));
    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[i + a.length] = b[i];
        }
        return result;
    }

    // if a and b lengths are 2. When array length is getting bigger, we need to use loop.
    // we can not assign array elements directly like below when array length is getting bigger.
    // let's say array length is 28, then we can not assign all 28 elements directly.
    public static int[] plusTwo2(int[] a, int[] b) {
        int[] result = new int[4];
        result[0] = a[0];
        result[1] = a[1];
        result[2] = b[0];
        result[3] = b[1];
        return result;
    }

    // if a and b lengths are 2. When array length is getting bigger, we need to use loop.
    // we can not write array elements directly like below when array length is getting bigger.
    // let's say array length is 28, then we can not write all 28 elements directly.
    public static int[] plusTwo3(int[] a, int[] b) {
        int[] newArray = {a[0], a[1], b[0], b[1]};
        return newArray;
    }

}
