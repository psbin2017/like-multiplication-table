package com.multiplication.designpattern.creation.abstractfactory;

import com.multiplication.designpattern.creation.abstractfactory.hero.AnpanHeroFactory;
import com.multiplication.designpattern.creation.abstractfactory.hero.CurrypanHeroFactory;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        FactoryOfBreadHeroFactory factory = new FactoryOfBreadHeroFactory();

        factory.createBreadHero(new AnpanHeroFactory());
        factory.createBreadHero(new CurrypanHeroFactory());
    }
}
