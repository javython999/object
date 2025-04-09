package com.errday.object.chapter2.discount;

import com.errday.object.chapter2.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
