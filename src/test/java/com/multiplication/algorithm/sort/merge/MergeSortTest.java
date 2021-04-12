package com.multiplication.algorithm.sort.merge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    @DisplayName("병합 정렬: 짝수의 배열 길이")
    @Test
    void testMergeSortByEven() throws Exception {
        // given
        int[] actual = new int[]{20, 2, 8, 4, 10, 18, 6, 14};

        // when
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(actual);
        int[] expected = new int[]{2, 4, 6, 8, 10, 14, 18, 20};

        // then
        assertArrayEquals(expected, actual);
    }

    @DisplayName("병합 정렬: 홀수의 배열 길이")
    @Test
    void testMergeSortByOdd() throws Exception {
        // given
        int[] actual = new int[]{9, 1, 3, 15, 19, 5, 13, 7, 21};

        // when
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(actual);
        int[] expected = new int[]{1, 3, 5, 7, 9, 13, 15, 19, 21};

        // then
        assertArrayEquals(expected, actual);
    }
}