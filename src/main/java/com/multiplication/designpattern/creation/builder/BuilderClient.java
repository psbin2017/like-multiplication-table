package com.multiplication.designpattern.creation.builder;

import com.multiplication.designpattern.creation.builder.effective.Customer;
import com.multiplication.designpattern.creation.builder.hero.builder.concrete.BreadpanHeroBuilder;
import com.multiplication.designpattern.creation.builder.hero.builder.concrete.MelonpanHeroBuilder;
import com.multiplication.designpattern.creation.builder.hero.director.MrJamDirector;
import com.multiplication.designpattern.creation.builder.hero.product.BreadHero;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderClient {
    public static void main(String[] args) {
        Customer customer = new Customer.Builder(1)
                                            .name("psbin")
                                            .nickname("psbin2017")
                                            .hobby("아이유")
                                            .build();

        log.info( customer.toString() );

        MrJamDirector mrJamDirector = new MrJamDirector();
        mrJamDirector.setBuilder(new MelonpanHeroBuilder());
        BreadHero melonpan =  mrJamDirector.build();

        log.info(melonpan.toString());

        mrJamDirector.setBuilder(new BreadpanHeroBuilder());
        BreadHero breadpan =  mrJamDirector.build();

        log.info(breadpan.toString());
    }
}
