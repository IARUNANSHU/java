package designpattern.decorator;

public class Sedan implements Vehicle{

    private  Vehicle vehicle;

    public Sedan (Vehicle vehicle){
        this.vehicle=vehicle;
    }

    @Override
    public Integer getprice() {
        return 20000;
    }
}
