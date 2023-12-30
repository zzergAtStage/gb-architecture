package com.zergatstage.s08.models;

import com.zergatstage.s08.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableService implements Model {

    private Collection<Table> tables;

    @Override
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {

        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }

    /**
     * @param oldReservation
     * @param reservationDate
     * @param tableNo
     * @param name
     * @return Reservation id or -1
     */
    @Override
    public int editReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        for (Table table: tables){
            if (table.getNo()== tableNo){
                for (Reservation reservation: table.getReservations()){
                    if (reservation.getId() == oldReservation){
                        reservation.setDate(reservationDate);
                        return reservation.getId();
                    }
                }
            }
        }
        return -1;
    }

}