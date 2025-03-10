package com.project.attempt;

import java.util.Arrays;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 = { 9,12,5,10,14,3,10 };
        System.out.println(Arrays.toString(partitionArrayAccordingToGivenPivot(nums1, 10)));

        int[] nums2 = { -3,4,3,2 };
        System.out.println(Arrays.toString(partitionArrayAccordingToGivenPivot(nums2, 2)));

    }

    // This method will partition the array according to int pivot as per challenge specifications.
    public static int[] partitionArrayAccordingToGivenPivot(int[] nums, int pivot) {

        // First, we must have a copy of the original array that we will not alter
        // and that we can refer back to at any given time.
        int[] numsOriginal = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numsOriginal[i] = nums[i];
        }

        // As we iterate through the original nums[] array to alter it as per challenge specifications,
        // we need to keep track of the current index that we are altering as we will be performing
        // several loops on numsOriginal[] to perform the alterations.
        int currentIndex = 0;

        // First, we will add all the values that are less than int pivot to the front of the array.
        // We will maintain their relative order as we loop through the numsOriginal[] array.
        for (int i = 0; i < numsOriginal.length; i++) {

            if (numsOriginal[i] < pivot) {
                nums[currentIndex] = numsOriginal[i];
                currentIndex++;
            }

        }

        // Next, we will add all the values that are equal to int pivot to the middle of the array.
        // We will maintain their relative order as we loop through the numsOriginal[] array.
        for (int i = 0; i < numsOriginal.length; i++) {

            if (numsOriginal[i] == pivot) {
                nums[currentIndex] = numsOriginal[i];
                currentIndex++;
            }

        }

        // Finally, we will add all the values that are more than int pivot to the back of the array.
        // We will maintain their relative order as we loop through the numsOriginal[] array.
        for (int i = 0; i < numsOriginal.length; i++) {

            if (numsOriginal[i] > pivot) {
                nums[currentIndex] = numsOriginal[i];
                currentIndex++;
            }

        }

        // Once we have performed the necessary alterations, we will return nums[] as it is.
        return nums;

    }

}
