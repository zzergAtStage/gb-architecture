package com.zergatstage.s04.task2;

import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/**
 * Мобильное приложение
 */
public class MobileApp {

    private Customer customer;
    private final TicketProvider ticketProvider;

    public MobileApp(TicketProvider ticketProvider, CustomerProvider customerProvider){
        this.ticketProvider = ticketProvider;
        Scanner sc = new Scanner(System.in);
        while (true) {
            String login = null, password = null;
            System.out.print("Enter your login: ");
            if (sc.hasNext()) { login = sc.nextLine();}
            System.out.print("\nEnter your password: ");
            if (sc.hasNext())  {password = sc.nextLine();}
            customer = customerProvider.getCustomer(login, password);
            if (customer != null) break;
        }
    }

    public Collection<Ticket> getTickets(){
        return customer.getTickets();
    }

    public void searchTicket(Date date){
        customer.setTickets(ticketProvider.searchTicket(customer.getId(), new Date()));
    }

    public boolean buyTicket(String cardNo){
        return ticketProvider.buyTicket(customer.getId(), cardNo);
    }

}
