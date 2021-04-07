package com.multiplication.algorithm.sort.insertion;

/**
 * 삽입 정렬
 */
public class InsertionSort {

    public void sortInsertion(int[] arr) {
        for ( int i = 1; i < arr.length; i++ ) {
            int target = arr[i];
            int range = i - 1;

            while ( (range >= 0) && (arr[range] > target ) ) {
                arr[range + 1] = arr[range];
                range--;
            }

            arr[range + 1] = target;
        }
    }
}