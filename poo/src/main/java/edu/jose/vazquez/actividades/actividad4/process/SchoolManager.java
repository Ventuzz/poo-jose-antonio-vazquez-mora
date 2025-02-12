package edu.jose.vazquez.actividades.actividad4.process;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import edu.jose.vazquez.actividades.actividad4.models.Course;
import edu.jose.vazquez.actividades.actividad4.models.Student;
import edu.jose.vazquez.actividades.actividad4.models.Teacher;
import edu.jose.vazquez.actividades.actividad4.models.Topic;

public class SchoolManager {

    public static Map<Course, List<Topic>> courseMap = new HashMap<>();
    public static Map<Teacher, List<Topic>> teacherMap = new HashMap<>();
    public static Map<Course, Teacher> courseTeacherMap = new HashMap<>();
    public static Map<Course, List<Student>> studentCourseMap = new HashMap<>();  
    public static Map<Topic, List<Topic>> topicMap = new HashMap<>();
    public static List<Topic> topicsP = new ArrayList<>();

    
    public static void enrollProfessor(Teacher teacher) {
        teacherMap.put(teacher, new ArrayList<>());
    }

    public static void enrollCourse(Course course) {
        courseMap.put(course, new ArrayList<>());
    }

    public static void enrollStudent(Student student) {
        studentCourseMap.putIfAbsent(null, new ArrayList<>()); 
    }

    public static void enrollTopic(Topic topic) {
        topicMap.put(topic, new ArrayList<>());
    }

    
    public static void assignProfessor(Course course, Teacher teacher) {
        courseTeacherMap.put(course, teacher);
    }

    public static void assignStudent(Course course, Student student) {
        studentCourseMap.putIfAbsent(course, new ArrayList<>());
        studentCourseMap.get(course).add(student);
        System.out.println(" Estudiante " + student.getName() + " se ha inscrito en " + course.getName());
    }

    public static void assignSubject(Topic topic, Teacher teacher) {
        teacherMap.putIfAbsent(teacher, new ArrayList<>());
        teacherMap.get(teacher).add(topic);
    }

    public static void enrollTopicToCourse(Topic topic, Course course) {
        courseMap.putIfAbsent(course, new ArrayList<>());
        courseMap.get(course).add(topic);
    }

    public static void StudentEnrollToCourse(Student student, Course course) {
        studentCourseMap.putIfAbsent(course, new ArrayList<>());
        studentCourseMap.get(course).add(student);
    }

    
    public static void showStudentsInCourse(Course course) {
        List<Student> students = studentCourseMap.get(course);

        System.out.println("\n Estos son los estudiantes en el curso: " + course.getName());
        if (students == null || students.isEmpty()) {
            System.out.println(" No hay estudiantes inscritos.");
            return;
        }

        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
    }

    public static void showCourses() {
        if (courseMap.isEmpty()) {
            System.out.println(" No hay cursos registrados.");
            return;
        }

        for (Map.Entry<Course, List<Topic>> entry : courseMap.entrySet()) {
            Course course = entry.getKey();
            List<Topic> topics = entry.getValue();
            Teacher teacher = courseTeacherMap.get(course);

            System.out.println("\n Curso: " + course.getName());
            System.out.println(" Profesor: " + (teacher != null ? teacher.getName() : "No asignado"));

            for (Topic topic : topics) {
                System.out.println(" - Tema: " + topic.getName() + ", Horas: " + topic.getHours() + ", Créditos: " + topic.getCredits());
            }
        }
    }

    public static void showTeachers() {
        if (teacherMap.isEmpty()) {
            System.out.println(" No hay profesores registrados.");
            return;
        }

        for (Map.Entry<Teacher, List<Topic>> entry : teacherMap.entrySet()) {
            Teacher teacher = entry.getKey();
            List<Topic> topics = entry.getValue();

            System.out.println("\n Estos son los profesores registrados: " + teacher.getName());
            for (Topic topic : topics) {
                System.out.println(" - Tema: " + topic.getName() + ", Horas: " + topic.getHours() + ", Créditos: " + topic.getCredits());
            }
        }
    }

    public static void calculateHours(Course course) {
        List<Topic> topics = courseMap.get(course);

        if (topics == null || topics.isEmpty()) {
            System.out.println(" No hay materias asignadas a " + course.getName());
            return;
        }

        int totalHours = 0;
        int totalCredits = 0;

        System.out.println("\n Curso: " + course.getName());

        for (Topic topic : topics) {
            System.out.println(" - Tema: " + topic.getName() + ", Horas: " + topic.getHours() + ", Créditos: " + topic.getCredits());
            totalHours += topic.getHours();
            totalCredits += topic.getCredits();
        }

        System.out.println(" Total de horas: " + totalHours);
        System.out.println(" Total de créditos: " + totalCredits);
    }

    public static void showTopics() {
        if (topicMap.isEmpty()) {
            System.out.println(" No hay temas registrados.");
            return;
        }

        for (Map.Entry<Topic, List<Topic>> entry : topicMap.entrySet()) {
            Topic topic = entry.getKey();
            List<Topic> topics = entry.getValue();

            System.out.println("\n Tema: " + topic.getName() + ", ID: " + topic.getId() + ", Créditos: " + topic.getCredits() + ", Horas: " + topic.getHours());
            for (Topic topic1 : topics) {
                System.out.println(" - Tema: " + topic1.getName() + ", ID: " + topic1.getId() + ", Créditos: " + topic1.getCredits() + ", Horas: " + topic1.getHours());
            }
        }
    }

    public static void calculateSalary(Teacher teacher) {
        if (!teacherMap.containsKey(teacher)) {
            System.out.println(" Profesor no encontrado.");
            return;
        }
    
        List<Topic> assignedTopics = teacherMap.get(teacher);
        if (assignedTopics == null || assignedTopics.isEmpty()) {
            System.out.println(" El profesor " + teacher.getName() + " no tiene materias asignadas.");
            return;
        }
    
        double salaryPerHour = teacher.getSalary();  
        double totalSalary = 0;
    
        System.out.println("\n Cálculo de salario para el profesor: " + teacher.getName());
    
        for (Topic topic : assignedTopics) {
            double topicSalary = topic.getHours() * salaryPerHour;
            totalSalary += topicSalary;
            System.out.println(" - Tema: " + topic.getName() + ", Horas: " + topic.getHours() + ", Pago por hora: $" + salaryPerHour + ", Subtotal: $" + topicSalary);
        }
    
        System.out.println(" Salario total: $" + totalSalary);
    }
    
    public static void calculateCredits(Course course) {
        int totalCredits = 0;
        for (Map.Entry<Course, List<Topic>> entry : courseMap.entrySet()) {
            for (Topic topic : entry.getValue()) {
                totalCredits += topic.getCredits();
            }
        }
        System.out.println("Total credits: " + totalCredits);
    }
}

