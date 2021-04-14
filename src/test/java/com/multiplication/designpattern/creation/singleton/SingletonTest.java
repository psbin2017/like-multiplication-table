package com.multiplication.designpattern.creation.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void 같은_인스턴스인지() throws Exception {
        // given
        Singleton singleton = Singleton.getInstance();

        // when

        // then
        assertEquals(singleton, Singleton.getInstance());
        assertEquals(singleton.hashCode(), Singleton.getInstance().hashCode());
    }
}