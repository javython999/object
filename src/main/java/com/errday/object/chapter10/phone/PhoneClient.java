package com.errday.object.chapter10.phone;

import java.time.Duration;
import java.time.LocalDateTime;

public class PhoneClient {

    public static void main(String[] args) {

        Phone phone = new Phone(Money.wons(5), Duration.ofSeconds(10), 10);

        phone.call(new Call(LocalDateTime.of(2025, 1, 1, 0, 0), LocalDateTime.of(2025, 1, 1, 0, 1)));
        phone.call(new Call(LocalDateTime.of(2025, 1, 1, 0, 10), LocalDateTime.of(2025, 1, 1, 0, 11)));

        Money money = phone.calculateFee();
        System.out.println(money);
    }
}
