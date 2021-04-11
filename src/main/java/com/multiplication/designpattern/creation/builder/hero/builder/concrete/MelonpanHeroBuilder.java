package com.multiplication.designpattern.creation.builder.hero.builder.concrete;

import com.multiplication.designpattern.creation.builder.hero.builder.BreadHeroBuilder;

public class MelonpanHeroBuilder extends BreadHeroBuilder {
    @Override
    public BreadHeroBuilder head() {
        hero.setHead("멜론");
        return this;
    }

    @Override
    public BreadHeroBuilder body() {
        hero.setBody("초록색 옷과 연초록 색의 벨트");
        return this;
    }

    @Override
    public BreadHeroBuilder mantle() {
        hero.setMantle("초록과 주황색 망토");
        return this;
    }
}
