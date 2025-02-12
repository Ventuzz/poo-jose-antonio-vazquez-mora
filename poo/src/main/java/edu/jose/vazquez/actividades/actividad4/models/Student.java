package edu.jose.vazquez.actividades.actividad4.models;

public class Student {
    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id) {
        setName(name);
        setAge(age);
        setId(id);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be less than or equal to 0");
        }
        this.age = age;
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

    public String toString() {
        return "Student: " + name + " Age: " + age + " ID: " + id;
    }
}
