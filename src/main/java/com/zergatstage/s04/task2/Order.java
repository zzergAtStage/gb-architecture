package com.zergatstage.s04.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class Order {
    @Getter
    private int orderId;
    private OrderState orderState;

    private List<Ticket> tickets;

    private int customerId;

}
