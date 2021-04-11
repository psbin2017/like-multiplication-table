package com.multiplication.designpattern.creation.builder.hero.builder.concrete;

import com.multiplication.designpattern.creation.builder.hero.builder.BreadHeroBuilder;

public class BreadpanHeroBuilder extends BreadHeroBuilder {
    @Override
    public BreadHeroBuilder head() {
        hero.setHead("식빵");
        return this;
    }

    @Override
    public BreadHeroBuilder body() {
        hero.setBody("하얀색 옷과 빨간 벨트");
        return this;
    }

    @Override
    public BreadHeroBuilder mantle() {
        hero.setMantle("하얀색 망토");
        return this;
    }
}
