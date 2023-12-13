package com.zergatstage.s04.task2;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Database {


    public Database(){


        Customer customer1 = new Customer("admin","1".hashCode());
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();
        customer1.getTickets().add(ticket1);
        customer1.getTickets().add(ticket2);
        customer1.getTickets().add(ticket3);
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        customers.put(customer1.getId(),customer1);
        Customer customer2 = new Customer("rabbit", 49);
        customers.put(customer2.getId(),customer2);//a rabbit

    }

    private static int counter = 100;

    private Collection<Ticket> tickets = new ArrayList<>();
    private Map<Integer,Customer> customers = new HashMap<>();

    private Collection<Order> orders = new ArrayList<>();
    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers.values();
    }

    /**
     * Получить актуальную стоимость билета
     * @return
     */
    public double getTicketAmount(){
        return 45;
    }

    /**
     * Получить идентификатор заявки на покупку билета
     * @return Order id
     */
    public int createTicketOrder(int clientId){
        if (!customers.containsKey(clientId))
            throw new IllegalArgumentException("Client id not found in the current database");
        int orderId = ++counter;
        Order order = new Order(orderId, OrderState.CREATED,new ArrayList<>(), clientId);
        //invariant
        return order.getOrderId();
    }

    /**
     * Getting the customer by login to check identity.
     * @param login String login
     * @param passHashCode HashCode of raw password
     * @return Existing or new (if not found) Customer
     * Does not support users with empty fields
     */
    public Customer getCustomerByLogin(String login, int passHashCode) {
        for(Map.Entry<Integer, Customer> customer: customers.entrySet()) {
            Customer checkedCustomer = customer.getValue();
            if ( !checkedCustomer.getName().isEmpty() && checkedCustomer.getName().equals(login)) {
                checkedCustomer.checkUserPass(passHashCode);
                return checkedCustomer;
            }
        }
        return new Customer(login,passHashCode);
    }

    private void checkUserPass(int passHashCode) {

    }
}
