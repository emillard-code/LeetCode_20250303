package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void partitionArrayAccordingToGivenPivotTest() {

        int[] nums1 = { 9, 12, 5, 10, 14, 3, 10 };
        int[] nums2 = { 9, 5, 3, 10, 10, 12, 14 };
        assertArrayEquals(nums2, LeetCodeAttempt.partitionArrayAccordingToGivenPivot(nums1, 10));

        int[] nums3 = { -3, 4, 3, 2 };
        int[] nums4 = { -3, 2, 4, 3 };
        assertArrayEquals(nums4, LeetCodeAttempt.partitionArrayAccordingToGivenPivot(nums3, 2));

    }

}
