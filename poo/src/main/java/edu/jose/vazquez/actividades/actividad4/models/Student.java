package edu.jose.vazquez.actividades.actividad4.models;

public class Student {
    private String name;
    private int age;
    private String id;
    /**
     * Constructor de la clase Student
     * @param name
     * @param age
     * @param id
     */
    public Student(String name, int age, String id) {
        setName(name);
        setAge(age);
        setId(id);
    }
    /**
     * Método para obtener el nombre del estudiante
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * Método para establecer el nombre del estudiante
     * @param name
     */
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }
    /**
     * Método para obtener la edad del estudiante
     * @return
     */
    public int getAge() {
        return age;
    }
    /**
     * Método para establecer la edad del estudiante
     * @param age
     */
    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be less than or equal to 0");
        }
        this.age = age;
    }

    /**
     * Método para obtener el ID del estudiante
     * @return
     */
    public String getId() {
        return id;
    }
    /**
     * Método para establecer el ID del estudiante
     * @param id
     */
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
