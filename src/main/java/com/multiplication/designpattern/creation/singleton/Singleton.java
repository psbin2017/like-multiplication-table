package com.multiplication.designpattern.creation.singleton;

public class Singleton {

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }
}
