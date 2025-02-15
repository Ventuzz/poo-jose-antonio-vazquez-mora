package edu.jose.vazquez.actividades.actividad4.process;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import edu.jose.vazquez.actividades.actividad4.models.Course;
import edu.jose.vazquez.actividades.actividad4.models.Student;
import edu.jose.vazquez.actividades.actividad4.models.Teacher;
import edu.jose.vazquez.actividades.actividad4.models.Subject;

public class SchoolManager {
    /**
     * Mapa de cursos con sus materias asignadas
     * Key: Course
     * Value: List<Subject>
     */
    public static Map<Course, List<Subject>> courseMap = new HashMap<>();
    public static Map<Teacher, List<Subject>> teacherMap = new HashMap<>();
    public static Map<Course, Teacher> courseTeacherMap = new HashMap<>();
    public static Map<Course, List<Student>> studentCourseMap = new HashMap<>();  
    public static Map<Student, List<Student>> studentMap = new HashMap<>();
    public static Map<Subject, List<Subject>> subjectMap = new HashMap<>();
    public static List<Subject> subjectsP = new ArrayList<>();
    /**
     * Método para dar de alta un profesor
     * @param teacher
     */
    public static void enrollTeacher(Teacher teacher) {
        teacherMap.put(teacher, new ArrayList<>());
    }
    /**
     * Método para dar de alta un curso
     * @param course
     */
    public static void enrollCourse(Course course) {
        courseMap.put(course, new ArrayList<>());
    }
    /**
     * Método para dar de alta un estudiante
     * @param student
     */
    public static void enrollStudent(Student student) {
        studentMap.put(student, new ArrayList<>());
    }
    /**
     * Método para dar de alta una materia
     * @param subject
     */
    public static void enrollSubject(Subject subject) {
        subjectMap.put(subject, new ArrayList<>());
    }
    /**
     * Método para asignar un estudiante a un curso
     * @param student
     * @param course
     */
    public static void assignStudentToCourse(Student student, Course course) {
        List<Subject> subjects = courseMap.get(course);
        if (subjects == null || subjects.size() < 3) {
            System.out.println(" Error: El curso " + course.getName() + " no tiene suficientes materias asignadas. Inscripción no permitida.");
            return;
        }
        for (Map.Entry<Course, List<Student>> entry : studentCourseMap.entrySet()) {
            if (entry.getValue().contains(student)) {
                System.out.println(" Error: El estudiante " + student.getName() + " ya está inscrito en otro curso.");
                return;
            }
        }
        studentCourseMap.putIfAbsent(course, new ArrayList<>());
        if (studentCourseMap.get(course).size() >= 26) {
            System.out.println(" Error: El curso " + course.getName() + " ya tiene 26 estudiantes inscritos. No se puede agregar más.");
            return;
        }
        studentCourseMap.get(course).add(student);
        for (Subject subject : subjects) {
            subject.getStudents().add(student);
        }
    
        System.out.println(" Estudiante " + student.getName() + " se ha inscrito en " + course.getName());
    }
    /**
     * Método para asignar una materia a un profesor
     * @param subject
     * @param teacher
     */
    public static void assignSubjectToTeacher(Subject subject, Teacher teacher) {
        teacherMap.putIfAbsent(teacher, new ArrayList<>());
    
        if (teacherMap.get(teacher).size() >= 4) {
            System.out.println("Error: El profesor " + teacher.getName() + " ya tiene 4 materias asignadas.");
            return;
        }
        if (subject.getTeacher() != null) {
            System.out.println("Error: La materia " + subject.getName() + " ya tiene un profesor asignado: " + subject.getTeacher().getName());
            return;
        }
        subject.setTeacher(teacher);
        teacherMap.get(teacher).add(subject);
    
        System.out.println("La materia " + subject.getName() + " se ha asignado al profesor " + teacher.getName());
    }
    /**
     * Método para asignar una materia a un curso
     * @param subject
     * @param course
     */
    public static void assignSubjectToCourse(Subject subject, Course course) {
        courseMap.putIfAbsent(course, new ArrayList<>());
        if (courseMap.get(course).size() >= 3) {
            System.out.println("Error: El curso " + course.getName() + " ya tiene 3 materias asignadas.");
            return;
        }
        Teacher assignedTeacher = subject.getTeacher();
        if (assignedTeacher == null) {
            assignedTeacher = findAvailableTeacher();
    
            if (assignedTeacher == null) {
                System.out.println("Error: No hay profesores disponibles para asignar la materia " + subject.getName());
                return;
            }
            subject.setTeacher(assignedTeacher);
            teacherMap.putIfAbsent(assignedTeacher, new ArrayList<>());
            teacherMap.get(assignedTeacher).add(subject);
    
            System.out.println("Se ha asignado automáticamente el profesor " + assignedTeacher.getName() + " a la materia " + subject.getName());
        } else {
            System.out.println("La materia " + subject.getName() + " ya tiene un profesor asignado: " + assignedTeacher.getName());
        }
        courseMap.get(course).add(subject);
        course.addTeacher(assignedTeacher);
        System.out.println("La materia " + subject.getName() + " se ha agregado al curso " + course.getName());
    }
    /**
     * Método para encontrar un profesor disponible y asignarle una materia automáticamente 
     * @return
     */
    private static Teacher findAvailableTeacher() {
        for (Map.Entry<Teacher, List<Subject>> entry : teacherMap.entrySet()) {
            if (entry.getValue().size() < 4) {
                return entry.getKey();
            }
        }
        return null; 
    }
    /**
     * Método para mostrar los estudiantes en un curso
     * @param course
     */
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
    /**
     * Método para mostrar los estudiantes en un curso
     * @param course
     */
    public static void showTeachersInCourse(Course course) {
        List<Teacher> teachers = course.getTeachers();
    
        if (teachers == null || teachers.isEmpty()) {
            System.out.println("No hay profesores asignados a " + course.getName());
            return;
        }
    
        System.out.println("\nProfesores asignados al curso " + course.getName() + ":");
        for (Teacher teacher : teachers) {
            System.out.println("- " + teacher.getName());
        }
    }
    /**
     * Método para mostrar los estudiantes en un curso
     * @param course
     */
    public static void showSubjectsInTeacher(Teacher teacher) {
        List<Subject> subjects = teacherMap.get(teacher);
    
        if (subjects == null || subjects.isEmpty()) {
            System.out.println("No hay materias asignadas a " + teacher.getName());
            return;
        }
    
        System.out.println("\nMaterias asignadas al profesor " + teacher.getName() + ":");
        for (Subject subject : subjects) {
            System.out.println("- " + subject.getName());
        }
    }
    /**
     * Método para mostrar los estudiantes en un curso
     * @param course
     */
    public static void showSubjectsInCourse(Course course) {
        List<Subject> subjects = courseMap.get(course);

        if (subjects == null || subjects.isEmpty()) {
            System.out.println(" No hay materias asignadas a " + course.getName());
            return;
        }

        System.out.println("\n Materias asignadas al curso " + course.getName());
        for (Subject subject : subjects) {
            System.out.println(" - " + subject.getName());
        }
    }
    /**
     * Método para calcular las horas y créditos de un curso
     * @param course
     */
    public static void calculateHoursAndCredits(Course course) {
        List<Subject> subjects = courseMap.get(course);

        if (subjects == null || subjects.isEmpty()) {
            System.out.println(" No hay materias asignadas a " + course.getName());
            return;
        }

        int totalHours = 0;
        int totalCredits = 0;

        System.out.println("\n Curso: " + course.getName());

        for (Subject subject : subjects) {
            System.out.println(" - Tema: " + subject.getName() + ", Horas: " + subject.getHours() + ", Créditos: " + subject.getCredits());
            totalHours += subject.getHours();
            totalCredits += subject.getCredits();
        }

        System.out.println(" Total de horas: " + totalHours);
        System.out.println(" Total de créditos: " + totalCredits);
    }
    /**
     * Método para calcular el salario de un profesor
     * @param teacher
     */
    public static void calculateSalary(Teacher teacher) {
        if (!teacherMap.containsKey(teacher)) {
            System.out.println("Profesor no encontrado.");
            return;
        }
        List<Subject> assignedSubjects = teacherMap.get(teacher);
        if (assignedSubjects == null || assignedSubjects.isEmpty()) {
            System.out.println("El profesor " + teacher.getName() + " no tiene materias asignadas.");
            return;
        }
        int subjectCount = assignedSubjects.size();
        double baseSalaryPerHour = 250; // Salario base por hora
        double multiplier = 1.0;
        switch (subjectCount) {
            case 2:
                multiplier = 1.25; 
                break;
            case 3:
                multiplier = 1.50; 
                break;
            case 4:
                multiplier = 1.75; 
                break;
            default:
                multiplier = 1.0; 
                break;
        }
        double salaryPerHour = baseSalaryPerHour * multiplier;
        double totalSalary = 0;
        System.out.println("\nCálculo de salario para el profesor: " + teacher.getName());
        System.out.println("Materias asignadas: " + subjectCount);
        System.out.println("Pago por hora ajustado: $" + salaryPerHour);
        for (Subject subject : assignedSubjects) {
            double topicSalary = subject.getHours() * salaryPerHour;
            totalSalary += topicSalary;
            System.out.println(" - Materia: " + subject.getName() + ", Horas: " + subject.getHours() + ", Pago por hora: $" + salaryPerHour + ", Subtotal: $" + topicSalary);
        }
        System.out.println("Salario total: $" + totalSalary);
    }
    /**
     * Método para cargar datos de prueba en la base de datos de la escuela
     * @param course
     */
    public static void dataBase(){
        Student student1 = new Student("Jose", 20, "1234");
        Student student2 = new Student("Juan", 21, "5678");
        Student student3 = new Student("Pedro", 22, "91011");
        Student student4 = new Student("Maria", 23, "121314");
        Student student5 = new Student("Ana", 24, "151617");
        Student student6 = new Student("Luis", 25, "181920");
        Subject  topic1 = new Subject("Matematicas", "1", 4, 80);
        Subject  topic2 = new Subject("fundamentos", "2", 5, 80);
        Subject  topic3 = new Subject("POO", "3", 6, 80);
        Subject  topic4 = new Subject("Estructura", "4", 7, 80);
        Subject topic5 = new Subject("Base de datos", "5", 8, 80);
        Subject topic6 = new Subject("Redes", "6", 9, 80);
        Teacher teacher1 = new Teacher("Marco",  "Al086731");
        Teacher teacher2 = new Teacher("Pedro",  "Al086732");
        Teacher teacher3 = new Teacher("Maria",  "Al086733");
        Teacher teacher4 = new Teacher("Ana",  "Al086734");
        Course course1 = new Course("programacion", null);
        Course course2 = new Course("Fundamentos", null);
        enrollCourse(course2);
        enrollCourse(course1);
        enrollStudent(student1);
        enrollStudent(student2);
        enrollStudent(student3);
        enrollStudent(student4);
        enrollStudent(student5);
        enrollStudent(student6);
        enrollSubject(topic1);
        enrollSubject(topic2);
        enrollSubject(topic3);
        enrollSubject(topic4);
        enrollSubject(topic5);
        enrollSubject(topic6);
        enrollTeacher(teacher1);
        enrollTeacher(teacher2);
        enrollTeacher(teacher3);
        enrollTeacher(teacher4);

    }



}

