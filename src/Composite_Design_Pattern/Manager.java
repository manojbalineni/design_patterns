package Composite_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{

    private String name;
    private String position;
    private List<Employee> subordinates = new ArrayList<>();


    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }


    @Override
    public void showDetails() {

        System.out.println("Manager: " + name + " - " + position);
        for (Employee emp : subordinates) {
            emp.showDetails();
        }

    }
}
