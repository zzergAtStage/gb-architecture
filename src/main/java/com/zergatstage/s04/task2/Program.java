package com.zergatstage.s04.task2;

import java.util.Collection;
import java.util.Date;

public class Program {

    /**
     * Разработать контракты и компоненты системы "Покупка онлайн билетов на автобус в час пик".
     * @param args
     */
    public static void main(String[] args) {
        MobileApp mobileApp;
        Core core = new Core();
        try {
            mobileApp = new MobileApp(core.getTicketProvider(), core.getCustomerProvider());

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
            //System.out.println(e.getMessage() + "\n try again later...");
            //return;
        }

        BusStation busStation = new BusStation(core.getTicketProvider());


        mobileApp.buyTicket("1000000000001");
        mobileApp.searchTicket(new Date());
        Collection<Ticket> tickets = mobileApp.getTickets();

        busStation.checkTicket("AAA");
    }

}
