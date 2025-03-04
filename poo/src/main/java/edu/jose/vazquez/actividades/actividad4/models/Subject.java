package edu.jose.vazquez.actividades.actividad4.models;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String name;
    private String id;
    private int credits;
    private int hours;
    private Course course;
    private List<Student> students;
    private Teacher teacher;
    /**
     * Constructor de la clase Subject
     * @param name
     * @param id
     * @param credits
     * @param hours
     */
    public Subject(String name, String id, int credits, int hours) {
        setName(name);
        setId(id);
        setCredits(credits);
        setHours(hours);
        this.students = new ArrayList<>();
    }
    /**
     * Método para obtener la representación en cadena de la materia
     * @return
     */
    public String toString() {
        return "Topic: " + name + " ID: " + id + " Credits: " + credits + " Hours: " + hours;
    }
    /**
     * Método para obtener el nombre de la materia
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * Método para establecer el nombre de la materia
     * @param name
     */
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }
    /**
     * Método para obtener el ID de la materia
     * @return
     */
    public String getId() {
        return id;
    }
    /**
     * Método para establecer el ID de la materia
     * @param id
     */
    public void setId(String id) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null");
        }
        this.id = id;
    }
    /**
     * Método para obtener los créditos de la materia
     * @return
     */
    public int getCredits() {
        return credits;
    }
    /**
     * Método para establecer los créditos de la materia
     * @param credits
     */
    public void setCredits(int credits) {
        if (credits <= 0) {
            throw new IllegalArgumentException("Credits cannot be less than or equal to 0");
        }
        this.credits = credits;
    }
    /**
     * Método para obtener las horas de la materia
     * @return
     */
    public int getHours() {
        return hours;
    }
    /**
     * Método para establecer las horas de la materia
     * @param hours
     */
    public void setHours(int hours) {
        if (hours <= 0) {
            throw new IllegalArgumentException("Hours cannot be less than or equal to 0");
        }
        this.hours = hours;
    }
    /**
     * Método para obtener el curso de la materia
     * @return
     */
    public Course getCourse() {
        return course;
    }
    /**
     * Método para establecer el curso de la materia
     * @param course
     */
    public void setCourse(Course course) {
        this.course = course;
    }
    /**
     * Método para obtener los estudiantes de la materia
     * @return
     */
    public List<Student> getStudents() {
        return students;
    }
    /**
     * Método para agregar un estudiante a la materia
     * @param student
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    /**
     * Método para obtener el profesor de la materia
     * @return
     */
    public Teacher getTeacher() {
        return teacher;
    }
    /**
     * Método para establecer el profesor de la materia
     * @param teacher
     */
    public void setTeacher(Teacher teacher) {
        if (teacher == null) {
            throw new IllegalArgumentException("El profesor no puede ser nulo.");
        }
        this.teacher = teacher;
    }
}
