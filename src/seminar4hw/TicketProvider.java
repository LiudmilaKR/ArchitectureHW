package seminar4hw;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Интерфейс действий с билетами
 */
public interface TicketProvider {

    List<Ticket> getAllTicket();

    Ticket addTicket(Ticket ticket);

    Ticket getTicketByNumber(int number);

    Ticket getTicketByPlace(int place);

    Ticket getTicketByDate(LocalDateTime date);

    boolean updateTicketStatus(Ticket ticket);
}
