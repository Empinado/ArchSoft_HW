package Sem_3.presenters;

import Sem_3.models.Table;
import java.util.Collection;

public interface View {
    void setObserver(ViewObserver observer);

    void updateTablesView(Collection<Table> tables);

    void updateReservationTableResult(int reservationNo);
}
