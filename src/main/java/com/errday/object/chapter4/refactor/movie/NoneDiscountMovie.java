package com.errday.object.chapter4.refactor.movie;

import com.errday.object.chapter4.refactor.discount.DiscountCondition;
import com.errday.object.chapter4.refactor.Money;

import java.time.Duration;

public class NoneDiscountMovie extends Movie {

    public NoneDiscountMovie(String title, Duration duration, Money fee, DiscountCondition... discountCondition) {
        super(title, duration, fee, discountCondition);
    }

    @Override
    protected Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
