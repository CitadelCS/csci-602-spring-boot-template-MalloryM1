package edu.citadel.hw1;

import java.time.LocalDate;
import java.util.Objects;

public class HourlyEmployee extends Employee{
    private double wageRate;
    private double hrsWorked;

    public HourlyEmployee(String name, LocalDate hireDate, Double wageRate, Double hrsWorked) {
        super(name, hireDate);
        this.wageRate = wageRate;
        this.hrsWorked = hrsWorked;
    }

    public double getWageRate() {
        return wageRate;
    }
    public double getHrsWorked() {
        return hrsWorked;
    }
    @Override
    public double getMonthlyPay() {
        return wageRate * hrsWorked;
    }

    @Override
    public String toString(){
        return String.format("HourlyEmployee[name=%s, hireDate=%s, wageRate=%.2f, hoursWorked=%.2f]",  getName(), getHireDate().toString(), getWageRate(), getHrsWorked());
    }

    public boolean equals(Employee e) {
        if (this == e) return true;
        if (!(e instanceof HourlyEmployee other)) return false;
        return Objects.equals(getName(), other.getName()) &&
                Objects.equals(getHireDate(), other.getHireDate()) &&
                Double.compare(wageRate, other.wageRate) == 0 &&
                Double.compare(hrsWorked, other.hrsWorked) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHireDate(), wageRate, hrsWorked);
    }
}
