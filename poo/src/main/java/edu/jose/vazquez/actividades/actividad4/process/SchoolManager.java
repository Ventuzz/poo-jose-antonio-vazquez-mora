package edu.jose.vazquez.actividades.actividad4.process;


import java.util.ArrayList;
import edu.jose.vazquez.actividades.actividad4.models.Course;
import edu.jose.vazquez.actividades.actividad4.models.Student;
import edu.jose.vazquez.actividades.actividad4.models.Teacher;
import edu.jose.vazquez.actividades.actividad4.models.Topic;

public class SchoolManager {

    ArrayList<Course> courses;
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;
    ArrayList<Topic> topics;

    public SchoolManager() {
        courses = new ArrayList<>();
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        topics = new ArrayList<>();
    }

    public void addCourse(String name, ArrayList<Topic> topics) {
        courses.add(new Course(name, topics));
    }

    public void addTopic(String name, String id, int credits, int hours) {
        topics.add(new Topic(name, id, credits, hours));
    }

    public void addStudent(String name, int age, String enrollment, String id) {
        students.add(new Student(name, age, enrollment, id));
    }

    public void addTeacher(String name, String payroll, double salary, String subject) {
        teachers.add(new Teacher(name, payroll, salary, subject));
    }


    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Topic> getTopics() {
        return topics;
    }

    public int getStudentsCount() {
        return students.size();
    }

    public int getTeachersCount() {
        return teachers.size();
    }

    public int getCoursesCount() {
        return courses.size();
    }

    public int getTopicsCount() {
        return topics.size();
    }

    public int getTotalCredits() {
        int totalCredits = 0;
        for (Course course : courses) {
            totalCredits += course.getCredits();
        }
        return totalCredits;
    }

    
}
