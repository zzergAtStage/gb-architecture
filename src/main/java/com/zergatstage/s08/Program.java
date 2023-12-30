package com.zergatstage.s08;

import com.zergatstage.s08.models.TableService;
import com.zergatstage.s08.presenters.BookingPresenter;
import com.zergatstage.s08.presenters.Model;
import com.zergatstage.s08.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * done: Домашнее задание - метод changeReservationTable заработал!
     *
     * @param args some command line args - ignored
     */
    public static void main(String[] args) {

        Model tableService = new TableService();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableService, bookingView);
        bookingPresenter.updateUILoadTables();
        bookingView.reservationTable(new Date(), 3, "Станислав");
        bookingPresenter.updateUILoadTables();
        bookingView.changeReservationTable(1001, new Date(), 3, "Станислав");
        bookingPresenter.updateUILoadTables();
    }

}
