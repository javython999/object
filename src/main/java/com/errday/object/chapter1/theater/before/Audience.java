package com.errday.object.chapter1.theater.before;

import lombok.Getter;

@Getter
public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

}
