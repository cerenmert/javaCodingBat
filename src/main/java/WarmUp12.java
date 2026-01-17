import java.util.Arrays;

/*
Given an int array, return a new array with double the length where its last element is the same as the
original array, and all the other elements are 0. The original array will be length 1 or more.
Note: by default, a new int array contains all 0's.
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
*/
public class WarmUp12 extends BaseClass {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6};
        int[] actual = makeLast(nums);
        int[] expected = new int[]{0, 0, 0, 0, 0, 6};
        isTestPassed(Arrays.toString(actual), Arrays.toString(expected));

        int[] nums2 = {3};
        int[] actual2 = makeLast(nums2);
        int[] expected2 = new int[]{0, 3};
        isTestPassed(Arrays.toString(actual2), Arrays.toString(expected2));
    }

    public static int[] makeLast(int[] nums) {
        int newSize = nums.length * 2;
        int[] newArray = new int[newSize];
        int lastNum = nums[(nums.length) - 1];
        for (int i = 0; i < newSize; i++) {
            if (i == newSize - 1) {
                newArray[newSize - 1] = lastNum;
            } else {
                newArray[i] = 0;
            }
        }
        return newArray;
    }
}
