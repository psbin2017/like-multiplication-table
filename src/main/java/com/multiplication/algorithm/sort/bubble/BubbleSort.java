package com.multiplication.algorithm.sort.bubble;

/**
 * 버블 정렬
 */
public class BubbleSort {

    public void sort(int[] arr) {
        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = 0; j < arr.length - i - 1; j++ ) {
                if ( arr[j] > arr[j + 1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
