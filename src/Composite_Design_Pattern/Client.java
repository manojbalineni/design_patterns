package Composite_Design_Pattern;

public class Client {
    public static void main(String[] args) {

        // Leaf employees
        Employee dev1 = new Developer("Manoj", "Java Developer");
        Employee dev2 = new Developer("Vissu", "Python Developer");

        // Composite manager
        Manager engineeringManager = new Manager("Swapna", "Engineering Manager");
        engineeringManager.add(dev1);
        engineeringManager.add(dev2);

        // Higher-level manager
        Manager ceo = new Manager("Siri", "CEO");
        ceo.add(engineeringManager);

        // Display entire company structure
        ceo.showDetails();

    }
}
