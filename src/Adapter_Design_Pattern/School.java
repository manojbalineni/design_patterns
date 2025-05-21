package Adapter_Design_Pattern;

public class School {

    public static void main(String[] args) {

        Pen pp = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(pp);
        aw.writeAssignment("I am bit tried to write an assignment");

    }
}
