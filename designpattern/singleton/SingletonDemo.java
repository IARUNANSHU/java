package designpattern.singleton;

// Main class to demonstrate usage
public class SingletonDemo {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton = Singleton.getInstance();

        // Use the singleton
        singleton.showMessage();

        // Try to get another instance
        Singleton anotherSingleton = Singleton.getInstance();

        // Check if both references point to the same object
        System.out.println("Are both references the same object? " + (singleton == anotherSingleton));
    }
}
