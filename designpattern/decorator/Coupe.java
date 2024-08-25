package designpattern.decorator;

public class Coupe implements Vehicle{

    private Integer price;
    Coupe(Integer price){
        this.price=price;
    }
    @Override
    public Integer getprice() {
        return 10000;
    }
}
