package com.multiplication.designpattern.creation.factorymethod.creator;

import com.multiplication.designpattern.creation.factorymethod.product.Phone;
import com.multiplication.designpattern.creation.factorymethod.product.concrete.GalaxyPhone;
import com.multiplication.designpattern.creation.factorymethod.product.concrete.IPhone;

public class PhoneFactory {

    public enum PhoneType {
        SAMSUNG,
        APPLE
    }

    public static Phone create(PhoneType type) {
        Phone phone;
        switch (type) {
            case SAMSUNG:
                phone = new GalaxyPhone();
                break;
            case APPLE:
                phone = new IPhone();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return phone;
    }
}
