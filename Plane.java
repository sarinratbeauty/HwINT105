package vehicle;

public class Plane extends Vehicle {

    private int wing;
    private String airline;

    public Plane(int wing, String airline) {
        this.wing = wing;
        this.airline = airline;
    }

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
        return super.toString()+ "Plane{"
                + "wing=" + wing
                + ", airline='" + airline + '\''
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        Plane temp;
        if (obj != null && obj instanceof Plane) {
            temp = (Plane) obj;
            if (wing == temp.wing && airline.equalsIgnoreCase(temp.airline) ) {
                return true;
            }

        }
        return false;
    }
}
