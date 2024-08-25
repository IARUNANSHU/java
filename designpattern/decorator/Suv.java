package designpattern.decorator;

public class Suv implements Vehicle{
        private Vehicle vehicle;

        public Suv(Vehicle vehicle){
            this.vehicle=vehicle;
        }

    @Override
    public Integer getprice() {
        return 30000;
    }
}
