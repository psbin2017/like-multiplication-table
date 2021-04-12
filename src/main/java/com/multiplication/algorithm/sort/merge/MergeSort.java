package com.multiplication.algorithm.sort.merge;

import com.multiplication.algorithm.sort.SortUtil;

/**
 * 병합 정렬
 */
public class MergeSort {

    public void sort(int[] arr) {
        sort(arr, 0, arr.length);
    }

    private void sort(int[] arr, int left, int right) {
        if ( right - left < 2 ) {
            return;
        }
        int mid = (right + left) / 2;

        // 분할
        sort(arr, left, mid);
        sort(arr, mid, right);

        // 정복
        merge(arr, left, mid, right);
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left];
        int index = 0;
        int l = left;
        int m = mid;

        while ( l < mid && m < right ) {
            if ( arr[l] < arr[m] ) {
                temp[index++] = arr[l++];
            } else {
                temp[index++] = arr[m++];
            }
        }

        while ( l < mid ) {
            temp[index++] = arr[l++];
        }

        while ( m < right ) {
            temp[index++] = arr[m++];
        }

        for ( int i = left; i < right; i++ ) {
            arr[i] = temp[i - left];
        }
        SortUtil.toString("arr", arr);
    }

}
