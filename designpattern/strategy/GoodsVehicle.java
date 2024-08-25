package designpattern.strategy;

import designpattern.strategy.drivestrategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
