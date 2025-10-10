package edu.citadel.hw1;

import java.time.LocalDate;
import java.util.Objects;

public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, LocalDate hireDate, Double annualSalary) {
        super(name, hireDate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }
    @Override
    public double getMonthlyPay() {
        return annualSalary/12.0;
    }
    //Public method `toString()` that returns a string of the form
    //`"SalariedEmployee[name=Curly Howard, hireDate=2009-05-21, annualSalary=105000.0]"`
    public String toString(){
        return String.format("SalariedEmployee[name=%s, hiredate=%s, annualSalary=%.2f]", getName(), getHireDate().toString(), getAnnualSalary());
    }

    public boolean equals(Employee e) {
        if (this == e) return true;
        if (!(e instanceof HourlyEmployee other)) return false;
        return Objects.equals(getName(), other.getName()) &&
                Objects.equals(getHireDate(), other.getHireDate());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHireDate(), annualSalary);
    }


}
