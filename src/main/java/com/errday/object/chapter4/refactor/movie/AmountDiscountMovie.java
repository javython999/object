package com.errday.object.chapter4.refactor.movie;

import com.errday.object.chapter4.refactor.discount.DiscountCondition;
import com.errday.object.chapter4.refactor.Money;

import java.time.Duration;

public class AmountDiscountMovie extends Movie {

    private Money discountAmount;

    public AmountDiscountMovie(String title, Duration duration, Money fee, Money discountAmount, DiscountCondition... discountCondition) {
        super(title, duration, fee, discountCondition);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return discountAmount;
    }
}
