package com.errday.object.chapter1;

import java.util.Collections;
import java.util.List;

public class TicketOffice {

    private Long amount;
    private List<Ticket> tickets = Collections.emptyList();

    public TicketOffice(Long amount, Ticket ...tickets) {
        this.amount = amount;
        this.tickets = List.of(tickets);
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

}
