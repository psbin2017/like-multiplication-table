package com.multiplication.designpattern.creation.abstractfactory.hero.head;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrypanHead implements BreadHead {

    @Override
    public void refillBread() {
        log.info("카레 충전~");
    }
}
