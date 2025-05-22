package Decarator_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription()); // Basic Coffee, Milk, Sugar
        System.out.println("Cost: $" + coffee.getCost()); // Cost: $6.5
    }
}
