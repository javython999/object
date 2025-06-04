package com.errday.object.chapter10.phone.abstracts;

import com.errday.object.chapter10.phone.Call;
import com.errday.object.chapter10.phone.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {

    private double taxRate;
    private List<Call> calls = new ArrayList<>();

    public Phone(double taxRate) {
        this.taxRate = taxRate;
    }

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }

        return result.plus(result.times(taxRate));
    }

    abstract protected Money calculateCallFee(Call call);
}
