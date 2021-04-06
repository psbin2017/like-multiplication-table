package com.multiplication.datastructure.search.linear;

import java.util.List;

/**
 * 순차 탐색
 * <p>
 * 앞에서부터 대상을 색인합니다.
 */
public class LinearSearch {

    /**
     * 탐색 대상 배열과 탐색할 대상을 받아 인덱스를 반환합니다.
     * 대상이 없는 경우 -1 을 반환합니다.
     *
     * @param arr    탐색 대상 배열
     * @param target 탐색 값
     * @return 인덱스 또는 찾지 못함 (-1)
     */
    public int searchFromArray(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 탐색 대상 목록과 탐색할 대상을 받아 인덱스를 반환합니다.
     * 대상이 없는 경우 -1 을 반환합니다.
     *
     * @param list   탐색 대상 목록
     * @param target 탐색 값
     * @param <T>    탐색 값의 타입
     * @return 인덱스 또는 찾지 못함 (-1)
     */
    public <T> int searchFromList(List<T> list, T target) {
        if (list.isEmpty()) {
            return -1;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

}
