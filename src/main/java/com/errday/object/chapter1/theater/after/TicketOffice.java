package com.errday.object.chapter1.theater.after;

import java.util.Collections;
import java.util.List;

public class TicketOffice {

    private Long amount;
    private List<Ticket> tickets = Collections.emptyList();

    public TicketOffice(Long amount, Ticket...tickets) {
        this.amount = amount;
        this.tickets = List.of(tickets);
    }

    public void sellToTicket(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }


}
