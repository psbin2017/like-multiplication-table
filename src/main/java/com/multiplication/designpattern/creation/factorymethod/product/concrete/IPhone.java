package com.multiplication.designpattern.creation.factorymethod.product.concrete;

import com.multiplication.designpattern.creation.factorymethod.product.Phone;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IPhone implements Phone {

    @Override
    public void call() {
        log.info("전화 앱으로 연결합니다.");
    }
}
