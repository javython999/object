package com.errday.object.chapter1.theater.before;

import lombok.Getter;

@Getter
public class TicketSeller {

    private final TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }
}
