package com.multiplication.algorithm.sort;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SortUtil {

    public static void toString(String head, int[] arr) {
        log.info( head + Arrays.toString(arr));
    }

}
