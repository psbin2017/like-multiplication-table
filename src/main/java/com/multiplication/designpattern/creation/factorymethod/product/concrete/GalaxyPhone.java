package com.multiplication.designpattern.creation.factorymethod.product.concrete;

import com.multiplication.designpattern.creation.factorymethod.product.Phone;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GalaxyPhone implements Phone {

    @Override
    public void call() {
        log.info("삼성 전화 앱으로 연결합니다.");
    }

}
