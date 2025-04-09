package com.errday.object.chapter2.discount;

import com.errday.object.chapter2.Screening;

public class SequenceCondition implements DiscountCondition {

    private final int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }


    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
