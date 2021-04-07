package com.multiplication.algorithm.sort.selection;

/**
 * 선택 정렬
 */
public class SelectionSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int value = arr[i];
            int index = i;

            for (int j = i + 1; j < arr.length; j++ ) {
                if ( value > arr[j] ) {
                    value = arr[j];
                    index = j;
                }
            }

            arr[index] = arr[i];
            arr[i] = value;
        }
    }

}
