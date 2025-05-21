package com.errday.object.chapter9.factory;

public class Client {

    private final Factory factory;

    public Client(Factory factory) {
        this.factory = factory;
    }

    public Money getAvatarFee() {
        return factory.createAvatarMovie().getFee();
    }
}
