package edu.jose.vazquez.actividades.actividad4.models;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String payroll;
    private Double salary;
    private List<Topic> topics;
    private boolean isAvailable;

    public Teacher(String name, Double salary, String payroll ) {
        setName(name);
        setPayroll(payroll);
        setSalary(salary);
        this.topics = new ArrayList<>();
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

    public List<Topic> getTopics() {
        return topics;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public String toString() {
        return "Teacher: " + name + " Payroll: " + payroll + " Salary: " + salary + " Topics: " + topics;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
