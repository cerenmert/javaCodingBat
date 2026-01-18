package Array;

import BaseClass.BaseClass;

/*
Given an array of ints of odd length, look at the first, last, and middle values in the array and
return the largest. The array length will be least 1.
maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
 */
public class WarmUp18 extends BaseClass {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int actual = maxTriple(nums1);
        BaseClass.isTestPassed(actual, 3);

        int[] nums2 = {5, 1, 7, 3, 7, 8, 1};
        actual = maxTriple(nums2);
        BaseClass.isTestPassed(actual, 5);
    }

    public static int maxTriple(int[] nums) {
        int first = nums[0];
        int max = first;
        int middleNum = nums[nums.length / 2];
        int lastNum = nums[nums.length - 1];
        if (nums.length > 1) {
            if (lastNum > first) {
                max = lastNum;
            }
            if (middleNum > first) {
                max = middleNum;
            }
        }
        return max;
    }


}
