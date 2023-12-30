package com.zergatstage.s08.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);
    void onEditReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
