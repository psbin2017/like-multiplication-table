package com.multiplication.designpattern.creation.builder.hero.product;

public class BreadHero {

    private String head;

    private String body;

    private String mantle;

    public void setHead(String head) {
        this.head = head;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setMantle(String mantle) {
        this.mantle = mantle;
    }

    @Override
    public String toString() {
        return "BreadHero{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", mantle='" + mantle + '\'' +
                '}';
    }
}
