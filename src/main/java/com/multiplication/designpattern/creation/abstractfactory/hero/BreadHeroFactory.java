package com.multiplication.designpattern.creation.abstractfactory.hero;

import com.multiplication.designpattern.creation.abstractfactory.hero.head.BreadHead;
import com.multiplication.designpattern.creation.abstractfactory.hero.body.BreadBody;

public interface BreadHeroFactory {
    BreadHead createBreadHead();
    BreadBody createBreadBody();
}
