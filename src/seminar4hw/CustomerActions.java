package seminar4hw;

import java.util.List;

public interface CustomerActions {

    List<Ticket> seeAllTicketsForBuy();

    public boolean buyTicket(Ticket ticket);

    public boolean refundTicket(Ticket ticket);
}
