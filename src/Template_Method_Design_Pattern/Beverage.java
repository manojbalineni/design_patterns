package Template_Method_Design_Pattern;

public abstract class Beverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void brew();
    protected abstract void addCondiments();
}
