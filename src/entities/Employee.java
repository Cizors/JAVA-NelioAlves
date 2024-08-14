package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentages) {
        grossSalary += grossSalary * percentages / 100.0;
    }

    public String toString() {
        return String.format("%s, $ %.2f", name, netSalary());
    }
}
