package com.zergatstage.s04.task2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;

public class Customer {

    private static int counter = 100;

    public Customer(){
        id = ++counter;
    }
    public Customer(String name){
        //precondition
        if (name.isEmpty() || name.isBlank()) throw new IllegalArgumentException("Name must be filled");
        id = ++counter;
        this.name = name;
    }

    private final int id;

    public String getName() {
        //post condition + invariant
        return (!name.isEmpty()) ? name: "Placeholder.Name";
    }

    private String name;
    @Getter
    private Collection<Ticket> tickets = new ArrayList<>();

    public void setTickets(Collection<Ticket> tickets) {
        if (tickets.isEmpty()) throw new IllegalArgumentException("Warning, the passenger is a rabbit!");
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }


}
