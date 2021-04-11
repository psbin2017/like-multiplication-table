package com.multiplication.designpattern.creation.abstractfactory;

import com.multiplication.designpattern.creation.abstractfactory.hero.BreadHeroFactory;

public class FactoryOfBreadHeroFactory {
    void createBreadHero(BreadHeroFactory factory) {
        factory.createBreadHead();
        factory.createBreadBody();
    }
}
