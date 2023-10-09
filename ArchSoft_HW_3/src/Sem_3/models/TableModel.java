package Sem_3.models;

import Sem_3.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получение списка всех столиков
     * @return
     */
    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     * @return Номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table : tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                System.out.println(reservation.getId()+"1");
                return reservation.getId();
            }
        }
        return -1;
    }


    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()){
                if(reservation.getId() == oldReservation){
                    table.getReservations().remove(reservation);
                    return reservationTable(reservationDate, tableNo, name);
                }
            }
        }
        System.out.printf("[%d] Такого номера резерва не существует", oldReservation);
        return 0;
    }
}
