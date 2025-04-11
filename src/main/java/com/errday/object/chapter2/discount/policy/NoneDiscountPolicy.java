package com.errday.object.chapter2.discount.policy;

import com.errday.object.chapter2.Money;
import com.errday.object.chapter2.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
