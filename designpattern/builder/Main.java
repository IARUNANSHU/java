package designpattern.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGPU("NVIDIA RTX 3070")
                .build();

        System.out.println(computer);

        // Another computer with different specs
        Computer basicComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 5")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        System.out.println(basicComputer);
    }
}