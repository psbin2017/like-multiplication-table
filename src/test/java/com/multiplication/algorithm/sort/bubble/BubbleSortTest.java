package com.multiplication.algorithm.sort.bubble;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("버블 정렬")
    @Test
    void testBubbleSort() throws Exception {
        // given
        int[] actual = new int[]{1,6,2,8,10,3,11,7};

        // when
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(actual);

        int[] expected = new int[]{1,2,3,6,7,8,10,11};

        // then
        assertArrayEquals(expected ,actual);
    }

}