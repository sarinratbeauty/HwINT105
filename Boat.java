public class Boat extends Vehicle {
    private String type;
    private double sona;

    public Boat(int numOfSeat, double fuel, double price) {
        super(numOfSeat, fuel, price);
    }

    public Boat(int numOfSeat, double fuel, double price, String type, double sona) {
        super(numOfSeat, fuel, price);
        this.type = type;
        this.sona = sona;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSona() {
        return sona;
    }

    public void setSona(double sona) {
        this.sona = sona;
    }

    @Override
    public String getMachine() {
        return "Float";
    }

    @Override
    public String toString() {
        return "Boat{" +
                "type='" + type + '\'' +
                ", sona=" + sona +
                '}';
    }
}
