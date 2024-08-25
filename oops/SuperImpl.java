package oops;

class Animal{
    String name;

    Animal(String name){
        this.name=name;
        System.out.println(name);
    }
    public void sound(){
        System.out.println("make sound");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
        System.out.println(name);

    }
    @Override
    public void sound(){
        super.sound();
        System.out.println("dog sound");
    }
}

public class SuperImpl {
    public static void main(String[] args) {
        Dog dog=new Dog("kutta");
        dog.sound();
    }
}
