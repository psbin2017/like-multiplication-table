package com.multiplication.designpattern.creation.builder.effective;

public class Customer {

    private final int id;

    private final String name;

    private final String nickname;

    private final String hobby;

    private Customer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.nickname = builder.nickname;
        this.hobby = builder.hobby;
    }

    public static class Builder {

        private final int id;

        private String name;

        private String nickname;

        private String hobby;

        public Builder(int id) {
            this.id = id;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder hobby(String hobby) {
            this.hobby = hobby;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
