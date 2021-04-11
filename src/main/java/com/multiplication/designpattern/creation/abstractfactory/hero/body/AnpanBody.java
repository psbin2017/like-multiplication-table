package com.multiplication.designpattern.creation.abstractfactory.hero.body;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnpanBody implements BreadBody {

    @Override
    public void punch() {
        log.info("호빵맨 펀치!");
    }

}
