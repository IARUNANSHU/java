package designpattern.strategy.drivestrategy;

public class SpecialDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("special drive strategy");
    }
}
