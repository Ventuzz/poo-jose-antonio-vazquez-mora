package edu.jose.vazquez.actividades.actividad4.models;
import java.util.ArrayList;

public class Course {
    String name;
    ArrayList<Topic> topics;


    public Course(String name, ArrayList<Topic> topics) {
        this.name = name;
        this.topics = topics;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Topic> getTopics() {
        return topics;
    }

    public int getCredits() {
        int creditosTotales = 0;
        for (Topic topic : topics) {
            creditosTotales += topic.getCredits();
        }
        return creditosTotales;
    }

    public int getHours() {
        int horasTotales = 0;
        for (Topic topic : topics) {
            horasTotales += topic.getHours();
        }
        return horasTotales;
    }
}