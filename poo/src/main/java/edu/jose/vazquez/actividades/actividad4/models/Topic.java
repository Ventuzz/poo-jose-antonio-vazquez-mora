package edu.jose.vazquez.actividades.actividad4.models;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private String name;
    private String id;
    private int credits;
    private int hours;
    private Course course;
    private List<Student> students;
    private Teacher teacher;

    public Topic(String name, String id, int credits, int hours) {
        setName(name);
        setId(id);
        setCredits(credits);
        setHours(hours);
        this.students = new ArrayList<>();
        
    }

    public String toString() {
        return "Topic: " + name + " ID: " + id + " Credits: " + credits + " Hours: " + hours;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null");
        }
        this.id = id;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        if (credits <= 0) {
            throw new IllegalArgumentException("Credits cannot be less than or equal to 0");
        }
        this.credits = credits;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours <= 0) {
            throw new IllegalArgumentException("Hours cannot be less than or equal to 0");
        }
        this.hours = hours;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
