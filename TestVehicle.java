package vehicle;

public class TestVehicle {
    public static void main(String[] args) {
       Plane p1 = new Plane(500, "NokAir");
       Plane p2 = new Plane(500, "NokAir");
     
        System.out.println(p1.equals(p2));
       
    }
}
