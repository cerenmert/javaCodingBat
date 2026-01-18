/*
We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false
 */
public class WarmUp17 extends BaseClass {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        boolean actual = unlucky1(arr1);
        isTestPassed(actual, true);

        int[] arr0 = {1, 1, 1, 3, 1};
        actual = unlucky1(arr0);
        isTestPassed(actual, false);

        int[] arr2 = {2, 1, 3, 4, 5};
        actual = unlucky1(arr2);
        isTestPassed(actual, true);

        int[] arr3 = {1, 1, 1};
        actual = unlucky1(arr3);
        isTestPassed(actual, false);
    }

    public static boolean unlucky1(int[] nums) {
        int n = nums.length;
        if (n < 2) return false;
        // first two element check
        if (nums[0] == 1 && nums[1] == 3) return true;
        if (n > 2 && nums[1] == 1 && nums[2] == 3) return true;
        //last two element check
        if (nums[n - 2] == 1 && nums[n - 1] == 3) return true;
        return false;
    }
}
