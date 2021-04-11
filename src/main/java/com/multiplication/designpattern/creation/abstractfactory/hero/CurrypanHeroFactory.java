package com.multiplication.designpattern.creation.abstractfactory.hero;

import com.multiplication.designpattern.creation.abstractfactory.hero.body.BreadBody;
import com.multiplication.designpattern.creation.abstractfactory.hero.body.CurrypanBody;
import com.multiplication.designpattern.creation.abstractfactory.hero.head.BreadHead;
import com.multiplication.designpattern.creation.abstractfactory.hero.head.CurrypanHead;

public class CurrypanHeroFactory implements BreadHeroFactory {

    @Override
    public BreadHead createBreadHead() {
        return new CurrypanHead();
    }

    @Override
    public BreadBody createBreadBody() {
        return new CurrypanBody();
    }
}
