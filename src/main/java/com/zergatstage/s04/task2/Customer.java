package com.zergatstage.s04.task2;

import lombok.Getter;
import lombok.Setter;

import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Customer {

    private static int counter = 100;

    public Customer(){
        id = ++counter;
    }

    /**
     * Constructor with name setting. Waits explicits defined name of customer
     * @param name Customer name, not null and not empty
     */
    public Customer(String name){
        //precondition
        if (name.isEmpty() || name.isBlank()) throw new IllegalArgumentException("Name must be filled");
        id = ++counter;
        this.name = name;
    }

    /**
     * Creates a new Customer with new parameters from side systems
     * @param loginAsName Login as name
     * @param passHashCode HashCode of pass
     */
    public Customer(String loginAsName, int passHashCode){
        id = ++counter;
        this.name = loginAsName;
        this.passHashCode = passHashCode;
    }
    @Getter
    private final int id;

    /**
     * Returns customer name. Only if it presented
     * @return Customer name or placeholder text
     */
    public String getName() {
        //post condition + invariant
        return (!name.isEmpty()) ? name: "Placeholder.Name";
    }

    private String name;
    @Getter
    private String login;
    @Getter
    @Setter
    private int passHashCode;
    @Getter
    private Collection<Ticket> tickets = new ArrayList<>();

    /**
     * To set up customers tickets, check - all of them belongs to the customer?
     * @param tickets Array of tickets
     *                strong preconditions!
     */
    public void setTickets(Collection<Ticket> tickets) {
        if (tickets.isEmpty()) throw new IllegalArgumentException("Warning, the passenger id=" + this.getId() + " is a rabbit!");
        this.tickets = tickets;
    }


    public void checkUserPass(int passHashCode) {
        if (passHashCode != this.passHashCode) throw new PasswordExceptionHandler("Wrong password!");
    }
}
