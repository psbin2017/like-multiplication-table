package com.multiplication.algorithm.sort.insertion;

import com.multiplication.algorithm.sort.SortUtil;

/**
 * 삽입 정렬
 */
public class InsertionSort {

    public void sort(int[] arr) {
        for ( int i = 1; i < arr.length; i++ ) {

            int value = arr[i];
            int range = i - 1;

            while ( (range >= 0) && (value < arr[range]) ) {
                arr[range + 1] = arr[range];
                range--;
            }
            arr[range + 1] = value;

            SortUtil.toString("after", arr);
        }
    }

}