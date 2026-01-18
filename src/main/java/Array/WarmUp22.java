/*
Given an array of ints, swap the first and last elements in the array. Return the modified array.
The array length will be at least 1.
swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 3]) → [3,1]
swapEnds([1]) → [1]
 */
package Array;

import BaseClass.BaseClass;

import java.util.Arrays;

public class WarmUp22 extends BaseClass {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] actual1 = swapEnds(arr1);
        int[] expected1 = {4, 2, 3, 1};
        isTestPassed(Arrays.toString(actual1), Arrays.toString(expected1));

        int[] arr2 = {1, 3};
        int[] actual2 = swapEnds(arr2);
        int[] expected2 = {3, 1};
        isTestPassed(Arrays.toString(actual2), Arrays.toString(expected2));

        int[] arr3 = {1};
        int[] actual3 = swapEnds(arr3);
        int[] expected3 = {1};
        isTestPassed(Arrays.toString(actual3), Arrays.toString(expected3));

    }

    public static int[] swapEnds(int[] nums) {
        // 1. Guard Clause (Koruyucu Madde):
        // Eğer dizi 1 elemanlıysa (veya boşsa) işlem yapma, direkt dön.
        // Bu hem performansı korur hem de gereksiz atamaları engeller.
        if (nums.length < 2) {
            return nums;
        }

        // 2. Swap İşlemi:
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;

        return nums;
    }

}
