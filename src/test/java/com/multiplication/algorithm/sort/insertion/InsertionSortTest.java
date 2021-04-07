package com.multiplication.algorithm.sort.insertion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @DisplayName("삽입 정렬")
    @Test
    void testInsertionSort() throws Exception {
        // given
        int[] actual = new int[]{7,5,11,9,3,1,13};

        // when
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sortInsertion(actual);
        int[] expected = new int[]{1,3,5,7,9,11,13};

        // then
        assertArrayEquals(expected, actual);
    }
}