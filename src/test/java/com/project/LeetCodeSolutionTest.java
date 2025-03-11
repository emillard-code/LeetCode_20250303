package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void pivotArrayTest() {

        int[] nums1 = { 9, 12, 5, 10, 14, 3, 10 };
        int[] nums2 = { 9, 5, 3, 10, 10, 12, 14 };
        assertArrayEquals(nums2, LeetCodeSolution.pivotArray(nums1, 10));

        int[] nums3 = { -3, 4, 3, 2 };
        int[] nums4 = { -3, 2, 4, 3 };
        assertArrayEquals(nums4, LeetCodeSolution.pivotArray(nums3, 2));

    }

}
