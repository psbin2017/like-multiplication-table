package com.multiplication.designpattern.creation.abstractfactory.hero.body;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrypanBody implements BreadBody {

    @Override
    public void punch() {
        log.info("카레빵맨 펀치!");
    }

}
