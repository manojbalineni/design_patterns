package Abstract_Factory_Design_Pattern;

public class ModernFurnitureFactory implements FurnitureFactory{

    public Chair createChair() {
        return new ModernChair();
    }
    public Sofa createSofa() {
        return new ModernSofa();
    }

}
