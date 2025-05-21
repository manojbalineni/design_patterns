package Abstract_Factory_Design_Pattern;

public class FactoryMain {
    public static void main(String[] args) {

        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        modernFactory.createChair().sit();
        modernFactory.createSofa().relax();
    }
}
