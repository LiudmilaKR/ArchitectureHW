package seminar4hw;

import java.time.LocalDateTime;

public abstract class Ticket {

    private int rootNumber;
    private int price;
    private LocalDateTime dataStart;
    private LocalDateTime dataEnd;
    private int place;
    private boolean isValid;

    public Ticket(int rootNumber, int price, LocalDateTime dataStart,
                  LocalDateTime dataEnd, int place) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.dataStart = dataStart;
        this.dataEnd = dataEnd;
        this.place = place;
        isValid = false;
    }

    public int getRootNumber() {
        return rootNumber;
    }

    public void setRootNumber(int rootNumber) {
        this.rootNumber = rootNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getDataStart() {
        return dataStart;
    }

    public void setDataStart(LocalDateTime dataStart) {
        this.dataStart = dataStart;
    }

    public LocalDateTime getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(LocalDateTime dataEnd) {
        this.dataEnd = dataEnd;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
