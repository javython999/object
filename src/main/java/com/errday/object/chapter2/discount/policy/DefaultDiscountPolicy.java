package com.errday.object.chapter2.discount.policy;

import com.errday.object.chapter2.Money;
import com.errday.object.chapter2.Screening;
import com.errday.object.chapter2.discount.DiscountCondition;

import java.util.Collections;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {

    private List<DiscountCondition> conditions = Collections.emptyList();

    public DefaultDiscountPolicy(DiscountCondition... conditions) {
        this.conditions = List.of(conditions);
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition condition : conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
