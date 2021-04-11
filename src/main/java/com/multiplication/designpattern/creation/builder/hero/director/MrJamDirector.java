package com.multiplication.designpattern.creation.builder.hero.director;

import com.multiplication.designpattern.creation.builder.hero.builder.BreadHeroBuilder;
import com.multiplication.designpattern.creation.builder.hero.product.BreadHero;

public class MrJamDirector {
    private BreadHeroBuilder builder;

    public void setBuilder(BreadHeroBuilder builder) {
        this.builder = builder;
    }

    public BreadHero build() {
        return builder.create()
                        .head()
                        .body()
                        .mantle()
                        .getHero();
    }

}