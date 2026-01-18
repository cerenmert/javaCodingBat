package Array;

import BaseClass.BaseClass;

import java.util.Arrays;

/*
Given an array of ints length 3, return an array with the elements "rotated left"
so {1, 2, 3} yields {2, 3, 1}.
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */
public class WarmUp10 extends BaseClass {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 11, 9};
        int[] result1 = rotateLeft3(arr1);
        int[] expected1 = new int[]{11, 9, 5};
        BaseClass.isTestPassed(Arrays.toString(result1), Arrays.toString(expected1));

        int[] arr2 = new int[]{7, 0, 0};
        int[] result2 = rotateLeft3(arr2);
        int[] expected2 = new int[]{0, 0, 7};
        BaseClass.isTestPassed(Arrays.toString(result2), Arrays.toString(expected2));

    }

    public static int[] rotateLeft3(int[] nums) {
        int[] newArray = new int[3];
        newArray[0] = nums[1];
        newArray[1] = nums[2];
        newArray[2] = nums[0];
        return newArray;
    }


}
