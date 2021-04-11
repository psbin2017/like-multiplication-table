package com.multiplication.designpattern.creation.abstractfactory.hero;

import com.multiplication.designpattern.creation.abstractfactory.hero.head.AnpanHead;
import com.multiplication.designpattern.creation.abstractfactory.hero.head.BreadHead;
import com.multiplication.designpattern.creation.abstractfactory.hero.body.AnpanBody;
import com.multiplication.designpattern.creation.abstractfactory.hero.body.BreadBody;

public class AnpanHeroFactory implements BreadHeroFactory {

    @Override
    public BreadHead createBreadHead() {
        return new AnpanHead();
    }

    @Override
    public BreadBody createBreadBody() {
        return new AnpanBody();
    }

}
