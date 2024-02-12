package seminar3hw.OCP;

public class House {

    private int quantityRoom;
    private String material;

    public House(int quantityRoom, String material) {
        this.quantityRoom = quantityRoom;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public int getQuantityRoom() {
        return quantityRoom;
    }
}
