package designpattern.strategy;

import designpattern.strategy.drivestrategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy1){
        this.driveStrategy=driveStrategy1;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
