package com.zergatstage.s08.presenters;

import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }

    public void updateUILoadTables() {
        view.showTables(model.loadTables());
    }

    public void updateUIReservationTableResult(int reservationNo) {
        view.showReservationTableResult(reservationNo);
    }


    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateUIReservationTableResult(reservationNo);
        } catch (Exception e) {
            updateUIReservationTableResult(-1);
        }
    }

    /**
     * @param oldReservation
     * @param reservationDate
     * @param tableNo
     * @param name
     * @Author Sergio Brü
     */
    @Override
    public void onEditReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        try {
            int reservationNo = model.editReservationTable(oldReservation, reservationDate, tableNo, name);
            updateUIReservationTableResult(reservationNo);
        } catch (Exception e){
            System.out.println(e.getMessage());
            updateUIReservationTableResult(-1);
        }
    }
}
