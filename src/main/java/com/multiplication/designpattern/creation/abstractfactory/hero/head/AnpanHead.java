package com.multiplication.designpattern.creation.abstractfactory.hero.head;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnpanHead implements BreadHead {

    @Override
    public void refillBread() {
        log.info("팥 충전~");
    }

}