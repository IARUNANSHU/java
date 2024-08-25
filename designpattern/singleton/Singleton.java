package designpattern.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // Initialization code, if any
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method of the Singleton
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

