package designpattern.decorator;

public class Main {
    public static void main(String[] args) {

        Vehicle v=new Coupe(1000);
        System.out.println(v.getprice());

        Vehicle vehicle=new Suv(v);
        System.out.println(vehicle.getprice());

        Vehicle vehicle1=new Sedan(vehicle);
        System.out.println(vehicle1.getprice());
    }
}
