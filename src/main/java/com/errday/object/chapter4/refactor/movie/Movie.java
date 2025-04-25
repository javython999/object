package com.errday.object.chapter4.refactor.movie;

import com.errday.object.chapter4.refactor.discount.DiscountCondition;
import com.errday.object.chapter4.refactor.Money;
import com.errday.object.chapter4.refactor.Screening;

import java.time.Duration;
import java.util.List;

public abstract class Movie {

    private String title;
    private Duration duration;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    public Movie(String title, Duration duration, Money fee, DiscountCondition ... discountCondition) {
        this.title = title;
        this.duration = duration;
        this.fee = fee;
        this.discountConditions = List.of(discountCondition);
    }

    public Money calculateMovieFee(Screening screening) {
        if (isDiscountable(screening)) {
            return fee.minus(calculateDiscountAmount());
        }

        return fee;
    }

    private boolean isDiscountable(Screening screening) {
        return discountConditions.stream()
                .allMatch(condition -> condition.isSatisfiedBy(screening));
    }

    abstract protected Money calculateDiscountAmount();

    protected Money getFee() {
        return fee;
    }
}
