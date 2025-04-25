package com.errday.object.chapter4.refactor.discount;

import com.errday.object.chapter4.refactor.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
