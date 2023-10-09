package Sem_3;

import Sem_3.models.TableModel;
import Sem_3.views.BookingView;
import Sem_3.presenters.BookingPresenter;

import java.util.ArrayList;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTableEvent(new Date(), 103, "Станислав");

        bookingView.changeReservationTable(9001, new Date(), 104, "Станислав");

    }
}
