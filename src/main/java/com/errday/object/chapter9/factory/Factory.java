package com.errday.object.chapter9.factory;

import java.time.Duration;

public class Factory {

    public Movie createAvatarMovie() {
        return new Movie("아바타", Duration.ofMinutes(120), Money.wons(10000), new AmountDiscountPolicy());
    }
}
