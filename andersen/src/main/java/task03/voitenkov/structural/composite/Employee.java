package task03.voitenkov.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee implements EmployeePlan {
    private String name;
    private String designation;
    private int salary;
    private List<Employee> subordinates;

    Employee(String name, String designation, int salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee e1) {
        subordinates.add(e1);
    }

    public void remove(Employee e1) {
        subordinates.remove(e1);
    }

    public void showSubordinatesDetails() {
        subordinates.forEach((item) -> {
            System.out.println("name :" + item.name + " position :" + item.designation + " salary :" + item.salary);
            item.showSubordinatesDetails();
        });
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }
}
