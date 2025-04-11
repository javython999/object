package com.errday.object.chapter2.discount.policy;

import com.errday.object.chapter2.Money;
import com.errday.object.chapter2.Screening;
import com.errday.object.chapter2.discount.DiscountCondition;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {

    private final double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
