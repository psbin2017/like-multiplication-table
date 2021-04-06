package com.multiplication.datastructure.search.binary;

/**
 * 이진 탐색
 * <p>
 * 전제 조건: 배열에 있는 요소는 반드시 정렬되어 있어야 합니다.
 */
public class BinarySearch {

    /**
     * 탐색 대상 배열과 탐색할 대상을 받아 인덱스를 반환합니다.
     * 대상이 없는 경우 -1 을 반환합니다.
     *
     * @param arr    탐색 대상 배열
     * @param target 탐색 값
     * @return 인덱스 또는 찾지 못함 (-1)
     */
    public int searchFromArray(int[] arr, int target) {
        int first = 0;
        int last = arr.length;
        while (first <= last) {
            int mid = (first + last) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target < arr[mid]) {
                /*
                 * 대상이 작은 경우 범위가 왼쪽으로 좁힘
                 * ex)
                 * first:0, last:10, mid: 5
                 * next
                 * first:0, last:4, mid: 2
                 *
                 * 1 을 뺀 이유는
                 * 1. 이전 색인 대상을 제외한다.
                 * 2. 대상이 없는 경우 탈출 조건을 만족할 수 있다.
                 */
                last = mid - 1;
            } else {
                /*
                 * 대상이 큰 경우 범위 오른쪽으로 좁아짐
                 * ex)
                 * first:0, last:10, mid: 5
                 * next
                 * first:6, last:10, mid: 8
                 *
                 * 1 을 더한 이유는
                 * 1. 이전 색인 대상을 제외한다.
                 * 2. 대상이 없는 경우 탈출 조건을 만족할 수 있다.
                 */
                first = mid + 1;
            }
        }
        return -1;
    }
}
