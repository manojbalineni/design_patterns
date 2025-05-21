package Adapter_Design_Pattern;

public class PenAdapter implements Pen{

    PilotPen pp = new PilotPen();
    @Override
    public void write(String str) {
        pp.marks(str);

    }
}
