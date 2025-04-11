package com.errday.object.chapter2.discount.policy;

import com.errday.object.chapter2.Money;
import com.errday.object.chapter2.Screening;
import com.errday.object.chapter2.discount.DiscountCondition;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {

    private final Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }

}
