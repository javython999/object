package com.errday.object.chapter10.phone.inherit;

import com.errday.object.chapter10.phone.Call;
import com.errday.object.chapter10.phone.Money;
import com.errday.object.chapter10.phone.typeclass.Phone;

import java.time.Duration;

public class NightlyDiscountPhone extends Phone {

    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;

    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds) {
        super(regularAmount, seconds);
        this.nightlyAmount = nightlyAmount;
    }

    @Override
    public Money calculateFee() {
        Money result = super.calculateFee();

        Money nightlyFee = Money.ZERO;
        for (Call call : getCalls()) {
            if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
                nightlyFee = nightlyFee.plus(
                        nightlyAmount.times(call.getDuration().getSeconds() / getSeconds().getSeconds())
                );
            }
        }

        return result.minus(nightlyFee);
    }
}
