package seminar4hw;

/**
 * держатель карт
 */
public class CashProvider {

    private long card;
    public boolean isAuthorization;

    public CashProvider(long card) {
        this.card = card;
        isAuthorization = false;
    }

    public long getCard() {
        return card;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public boolean isAuthorization() {
        return isAuthorization;
    }

    public void setAuthorization(boolean authorization) {
        isAuthorization = authorization;
    }
}
