package edu.jose.vazquez.actividades.actividad4.models;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String payroll;
    private Double salary;
    private List<Subject> subjects;
    private boolean isAvailable;
    /**
     * Constructor de la clase Teacher
     * @param name
     * @param payroll
     */
    public Teacher(String name, String payroll ) {
        setName(name);
        setPayroll(payroll);
        this.subjects = new ArrayList<>();
    }
    /**
     * Método para obtener el nombre del profesor
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * Método para establecer el nombre del profesor
     * @param name
     */
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");   
        }
        this.name = name;
    }
    /**
     * Método para obtener la nómina del profesor
     * @return
     */
    public String getPayroll() {
        return payroll;
    }
    /**
     * Método para establecer la nómina del profesor
     * @param payroll
     */
    public void setPayroll(String payroll) {
        if (payroll == null) {
            throw new IllegalArgumentException("Payroll cannot be null");
        }
        this.payroll = payroll;
    }
    /**
     * Método para obtener el salario del profesor
     * @return
     */
    public Double getSalary() {
        return salary;
    }
    /**
     * Método para establecer el salario del profesor
     * @param salary
     */
    public void setSalary(Double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary cannot be less than or equal to 0");
        }
        this.salary = salary;
    }
    /**
     * Método para obtener las materias del profesor
     * @return
     */
    public List<Subject> getSubjects() {
        return subjects;
    }
    /**
     * Método para agregar una materia al profesor
     * @param subject
     */
    public void addTopic(Subject subject) {
        subjects.add(subject);
    }
    /**
     * Método para obtener si el profesor está disponible
     * @return
     */
    public String toString() {
        return "Teacher: " + name + " Payroll: " + payroll + " Salary: " + salary + " Subjects: " + subjects;
    }
    /**
     * Método para obtener si el profesor está disponible
     * @return
     */
    public boolean getIsAvailable() {
        return isAvailable;
    }
    /**
     * Método para establecer si el profesor está disponible
     * @param isAvailable
     */
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
