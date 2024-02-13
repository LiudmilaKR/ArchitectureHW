package seminar4hw;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int id;
    //список купленных билетов
    private List<Ticket> ticketList;

    public Customer(int id) {
        this.id = id;
        ticketList = new ArrayList<>();
    }
}
