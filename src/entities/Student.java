package entities;

public class Student {

    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thridGrade;

    public double finalGrade() {
        return firstGrade + secondGrade + thridGrade;
    }

    public double missingPoints() {
        if (finalGrade() < 60.00) {
            return 60.00 - finalGrade();
        }
        else {
            return 0.00;
        }
    }
}
