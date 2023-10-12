package OnlineTicket;

public class BusTicket extends Ticket{

    int number;
    @Override
    public boolean reserveTicket() {
        return false;
    }

    @Override
    public boolean deductFunds() {
        return false;
    }

    @Override
    public boolean confirmPurchase() {
        return false;
    }

    @Override
    public void updateTicketAvailability() {

    }

    @Override
    public boolean cancelReservation() {
        return false;
    }
}
