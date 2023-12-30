package com.zergatstage.s08.views;

import com.zergatstage.s08.models.Table;
import com.zergatstage.s08.presenters.View;
import com.zergatstage.s08.presenters.ViewObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private Collection<ViewObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(ViewObserver observer) {
        observers.add(observer);
    }

    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
        else
            System.out.println("Не удалось забронировать столик. Повторите попытку позже. ");

    }

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        for (ViewObserver observer: observers){
            observer.onEditReservationTable(oldReservation,reservationDate,tableNo,name);
        }
    }

    //observers receive notifications
    public void reservationTable(Date orderDate, int tableNo, String name) {
        for (ViewObserver observer : observers) {
            observer.onReservationTable(orderDate, tableNo, name);
        }
    }

}
