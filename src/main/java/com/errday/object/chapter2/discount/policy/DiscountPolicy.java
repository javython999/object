package com.errday.object.chapter2.discount.policy;

import com.errday.object.chapter2.Money;
import com.errday.object.chapter2.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
