package edu.jose.vazquez.actividades.actividad4.models;

public class Teacher {
    private String name;
    private String payroll;
    private Double salary;
    private String subject;

    public Teacher(String name, String payroll, Double salary, String subject) {
        setName(name);
        setPayroll(payroll);
        setSalary(salary);
        setSubject(subject);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");   
        }
        this.name = name;
    }

    public String getPayroll() {
        return payroll;
    }

    public void setPayroll(String payroll) {
        if (payroll == null) {
            throw new IllegalArgumentException("Payroll cannot be null");
        }
        this.payroll = payroll;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary cannot be less than or equal to 0");
        }
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject == null) {
            throw new IllegalArgumentException("Subject cannot be null");
        }
        this.subject = subject;
    }
}
