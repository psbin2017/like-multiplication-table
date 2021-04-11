package com.multiplication.designpattern.creation.builder.hero.builder;

import com.multiplication.designpattern.creation.builder.hero.product.BreadHero;

public abstract class BreadHeroBuilder {
    protected BreadHero hero;

    public BreadHero getHero() {
        return hero;
    }

    public BreadHeroBuilder create() {
        hero = new BreadHero();
        return this;
    }

    public abstract BreadHeroBuilder head();
    public abstract BreadHeroBuilder body();
    public abstract BreadHeroBuilder mantle();
}