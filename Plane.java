public class Plane extends Vehicle {
    private int wing;
    private String airline;

    public Plane(int numOfSeat, double fuel, double price) {
        super(numOfSeat, fuel, price);
    }

    public Plane(int numOfSeat, double fuel, double price, int wing, String airline) {
        super(numOfSeat, fuel, price);
        this.wing = wing;
        this.airline = airline;
    }

    public int getWing() {
        return wing;
    }

    public void setWing(int wing) {
        this.wing = wing;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public String getMachine() {
        return "Fly";
    }

    @Override
    public String toString() {
        return "Plane{" +
                "wing=" + wing +
                ", airline='" + airline + '\'' +
                '}';
    }
}
