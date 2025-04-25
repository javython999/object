package com.errday.object.chapter4.refactor.movie;

import com.errday.object.chapter4.refactor.discount.DiscountCondition;
import com.errday.object.chapter4.refactor.Money;

import java.time.Duration;

public class PercentDiscountMovie extends Movie {

    private double percent;

    public PercentDiscountMovie(String title, Duration duration, Money fee, double percent, DiscountCondition... discountCondition) {
        super(title, duration, fee, discountCondition);
        this.percent = percent;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return getFee().times(percent);
    }
}
