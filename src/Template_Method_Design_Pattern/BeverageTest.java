package Template_Method_Design_Pattern;

public class BeverageTest {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("--------------");

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
