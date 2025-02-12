package edu.jose.vazquez.actividades.actividad4.models;
import java.util.ArrayList;
import java.util.List;

public class Course {
    String name;
    public List<Topic> topics;
    public List<Teacher> teachers;


    public Course(String name, ArrayList<Topic> topics) {
        this.name = name;
        this.teachers = new ArrayList<>();    
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

    public List<Topic> getTopics() {
        return topics;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }


    public int getCredits() {
        int creditsTotales = 0;
        for (Topic topic : topics) {
            creditsTotales += topic.getCredits();
        }
        return creditsTotales;
    }

    public int getHours() {
        int horasTotales = 0;
        for (Topic topic : topics) {
            horasTotales += topic.getHours();
        }
        return horasTotales;
    }

    public String toString() {
            return "Course: " + name + " Credits: " + getCredits() + " Hours: " + getHours() + " Topics: " + topics;
        }
}