package org.example;

public class Lecturer extends Person {
    private String empNum;
    private long salary;

    public Lecturer()
    {}

    public Lecturer(String empNum, long sal)
    {
        super();
        this.empNum = empNum;
        this.salary = sal;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void salaryIncrease(long amount)
    {
        salary += amount;
    }
}

