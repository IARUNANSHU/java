package designpattern.strategy;

import designpattern.strategy.drivestrategy.SpecialDrive;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SpecialDrive());
    }
}
