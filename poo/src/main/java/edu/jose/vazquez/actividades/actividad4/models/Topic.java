package edu.jose.vazquez.actividades.actividad4.models;

public class Topic {
    private String name;
    private String id;
    private int credits;
    private int hours;

    public Topic(String name, String id, int credits, int hours) {
        setName(name);
        setId(id);
        setCredits(credits);
        setHours(hours);
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

}
