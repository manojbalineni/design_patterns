package Bridge_Design_Pattern;

public class Remote {
    Device device; // this is the bridge

    public Remote(Device device) {
        this.device = device;
    }

    public void pressPowerButton() {
        device.turnOn();
    }
}
