package seminar4hw;

/**
 * Действия c картами
 */
public interface CashActions {

    boolean buy(int price);

    boolean refund(int price);

    void authorization(Customer customer);
}
