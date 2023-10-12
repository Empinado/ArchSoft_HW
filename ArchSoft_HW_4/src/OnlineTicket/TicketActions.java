package OnlineTicket;

public interface TicketActions {
    boolean reserveTicket();
    boolean deductFunds();
    boolean confirmPurchase();
    void updateTicketAvailability();
    boolean cancelReservation();
}