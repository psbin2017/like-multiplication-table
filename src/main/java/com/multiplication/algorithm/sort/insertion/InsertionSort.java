package com.multiplication.algorithm.sort.insertion;

/**
 * 삽입 정렬
 */
public class InsertionSort {

    public void sort(int[] arr) {
        for ( int i = 1; i < arr.length; i++ ) {

            int value = arr[i];
            int range = i - 1;

            while ( (range >= 0) && (arr[range] > value ) ) {
                arr[range + 1] = arr[range];
                range--;
            }

            arr[range + 1] = value;
        }
    }

}