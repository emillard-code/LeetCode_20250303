package com.project.solution;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCodeSolution {

    public static void main(String[] args) {

        int[] nums1 = { 9,12,5,10,14,3,10 };
        System.out.println(Arrays.toString(pivotArray(nums1, 10)));

        int[] nums2 = { -3,4,3,2 };
        System.out.println(Arrays.toString(pivotArray(nums2, 2)));

    }

    public static int[] pivotArray(int[] nums, int pivot) {

        LinkedList<Integer> less = new LinkedList<>();
        LinkedList<Integer> equal = new LinkedList<>();
        LinkedList<Integer> greater = new LinkedList<>();

        for (int num : nums) {

            if (num < pivot) {
                less.add(num);
            } else if (num > pivot) {
                greater.add(num);
            } else {
                equal.add(num);
            }

        }

        less.addAll(equal);
        less.addAll(greater);

        int i = 0;
        int[] ans = new int[nums.length];

        for (int num : less) {
            ans[i++] = num;
        }

        return ans;

    }

}
