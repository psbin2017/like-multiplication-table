package com.multiplication.designpattern.creation.prototype;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PrototypeClient {
    public static void main(String[] args) {
        List<Integer> originList = new ArrayList<>();
        originList.add(1);
        originList.add(2);
        originList.add(3);
        List<Integer> shallowCopyList = originList;

        originList.add(4);

        log.info( "얕은 복사 " + (originList.size() != shallowCopyList.size()) );

        List<Integer> deepCopyList = new ArrayList<>(originList);

        originList.add(5);

        log.info( "깊은 복사 " + (deepCopyList.size() != shallowCopyList.size()) );
    }
}
