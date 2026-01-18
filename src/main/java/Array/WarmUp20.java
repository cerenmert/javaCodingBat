/*
Given an array of ints of odd length, return a new array length 3 containing the elements from
the middle of the array. The array length will be at least 3.
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
 */
package Array;

import BaseClass.BaseClass;

import java.util.Arrays;

public class WarmUp20 extends BaseClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] actual = midThree(arr);
        int[] expected = {3, 4, 5};
        isTestPassed(Arrays.toString(actual), Arrays.toString(expected));
    }

    public static int[] midThree(int[] nums) {
        int[] newArray = new int[3];
        int length = nums.length;
        int middle = nums[length / 2];
        int middleLeft = nums[length / 2 - 1];
        int middleRight = nums[length / 2 + 1];
        newArray[0] = middleLeft;
        newArray[1] = middle;
        newArray[2] = middleRight;
        return newArray;
    }

}
