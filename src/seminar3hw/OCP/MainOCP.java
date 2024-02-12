package seminar3hw.OCP;

public class MainOCP {
    public static void main(String[] args) {

        House house1 = new House(3, "Monoblock");
        System.out.println("House from " + house1.getMaterial()
                + ", " + house1.getQuantityRoom() + " rooms.");
        House house2 = new WoodHouse(7);
        System.out.println("House from " + house2.getMaterial()
                + ", " + house2.getQuantityRoom() + " rooms.");
        House house3 = new BrickHouse(8);
        System.out.println("House from " + house3.getMaterial()
                + ", " + house3.getQuantityRoom() + " rooms.");
    }
}
