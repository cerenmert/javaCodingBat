package Array;

import BaseClass.BaseClass;

import java.util.Arrays;

/*
Given an array of ints of even length, return a new array length 2 containing the middle two elements from
the original array. The original array will be length 2 or more.
makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
 */
public class WarmUp15 extends BaseClass {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] actual = makeMiddle(nums);
        int[] expected = {2, 3};
        BaseClass.isTestPassed(Arrays.toString(actual), Arrays.toString(expected));

        int[] nums2 = {7, 1, 6, 3, 4, 9};
        int[] actual2 = makeMiddle(nums2);
        int[] expected2 = {6, 3};
        BaseClass.isTestPassed(Arrays.toString(actual2), Arrays.toString(expected2));

        int[] nums3 = {1, 2};
        int[] actual3 = makeMiddle(nums3);
        int[] expected3 = {1, 2};
        BaseClass.isTestPassed(Arrays.toString(actual3), Arrays.toString(expected3));
    }

    public static int[] makeMiddle(int[] nums) {
        int[] newArray = new int[2];
        newArray[1] = nums[nums.length / 2];
        newArray[0] = nums[nums.length / 2 - 1];
        return newArray;
    }
}
