package designpattern.strategy;

import designpattern.strategy.drivestrategy.DriveStrategy;
import designpattern.strategy.drivestrategy.SpecialDrive;

public class OffroadVehicle extends Vehicle {

    OffroadVehicle(){
        super(new SpecialDrive());
    }
}
