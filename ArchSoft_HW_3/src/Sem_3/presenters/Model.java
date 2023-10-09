package Sem_3.presenters;

import Sem_3.models.Table;
import java.util.Collection;
import java.util.Date;

public interface Model {
    /**
     * Получение списка всех столиков
     * @return
     */
    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     * @return Номер брони
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
