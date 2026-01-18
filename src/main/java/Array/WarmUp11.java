package Array;

import BaseClass.BaseClass;

import java.util.Arrays;

/*
Given an array of ints length 3, figure out which is larger, the first or last element in the array,
and set all the other elements to be that value.
Return the changed array.
maxEnd3([1, 2, 3]) → [3, 3, 3]
 */
public class WarmUp11 extends BaseClass {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] actual = maxEnd3(nums);
        int[] expected = new int[]{3, 3, 3};
        BaseClass.isTestPassed(Arrays.toString(actual), Arrays.toString(expected));

        int[] nums2 = {11, 5, 9};
        int[] actual2 = maxEnd3(nums2);
        int[] expected2 = new int[]{11, 11, 11};
        BaseClass.isTestPassed(Arrays.toString(actual2), Arrays.toString(expected2));
    }

    public static int[] maxEnd3(int[] nums) {
        int max = nums[0];
        if (nums[2] > nums[0]) {
            max = nums[2];
        }
        return new int[]{max, max, max};
    }
}
