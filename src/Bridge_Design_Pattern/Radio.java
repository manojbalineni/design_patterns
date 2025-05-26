package Bridge_Design_Pattern;

public class Radio implements Device {
    public void turnOn() {
        System.out.println("Radio is turned ON");
    }

    public void turnOff() {
        System.out.println("Radio is turned OFF");
    }
}