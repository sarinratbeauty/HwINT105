public class Vehicle {
    private int numOfSeat;
    private double fuel;
    private double price;

    public Vehicle() {
    }

    public Vehicle(int numOfSeat, double fuel, double price) {
        this.numOfSeat = numOfSeat;
        this.fuel = fuel;
        this.price = price;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMachine() {
        return "Forward";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numOfSeat=" + numOfSeat +
                ", fuel=" + fuel +
                ", price=" + price +
                '}';
    }
}
