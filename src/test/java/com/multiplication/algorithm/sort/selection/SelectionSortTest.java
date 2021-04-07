package com.multiplication.algorithm.sort.selection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @DisplayName("선택 정렬")
    @Test
    void testSelectionSort() throws Exception {
        // given
        int[] actual = new int[]{5, 7, 3, 8, 11, 9, 1};

        // when
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(actual);
        int[] expected = new int[]{1, 3, 5, 7, 8, 9, 11};

        // then
        assertArrayEquals(expected, actual);
    }
}