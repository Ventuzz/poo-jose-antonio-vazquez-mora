package edu.jose.vazquez.actividades.actividad4;
import edu.jose.vazquez.actividades.actividad4.models.Course;
import edu.jose.vazquez.actividades.actividad4.models.Student;
import edu.jose.vazquez.actividades.actividad4.models.Teacher;
import edu.jose.vazquez.actividades.actividad4.models.Topic;
import edu.jose.vazquez.actividades.actividad4.process.SchoolManager;
import edu.jose.vazquez.actividades.actividad4.ui.CLI;

public class Starter {
    public static void main(String[] args) {
        //CLI.selectLang();
        //CLI.runApp();
        SchoolManager schoolManager = new SchoolManager();
        
        Student student1 = new Student("Jose", 20, "1234");
        Student student2 = new Student("Juan", 21, "5678");
        Student student3 = new Student("Pedro", 22, "91011");
        Student student4 = new Student("Maria", 23, "121314");
        Student student5 = new Student("Ana", 24, "151617");
        Student student6 = new Student("Luis", 25, "181920");

        Topic  topic1 = new Topic("Matematicas", "1", 4, 80);
        Topic  topic2 = new Topic("fundamentos", "2", 5, 80);
        Topic  topic3 = new Topic("POO", "3", 6, 80);
        Topic  topic4 = new Topic("Estructura", "4", 7, 80);

        Teacher teacher1 = new Teacher("Marco", 250.0, "Al086731");
        Teacher teacher2 = new Teacher("Pedro", 300.0, "Al086732");
        Teacher teacher3 = new Teacher("Maria", 350.0, "Al086733");
        Teacher teacher4 = new Teacher("Ana", 400.0, "Al086734");

        Course course1 = new Course("programacion", null);
        Course course2 = new Course("Fundamentos", null);

            //schoolManager.enrollCourse(course1);
            //schoolManager.enrollTopic(topic1);
            //schoolManager.enrollTopic(topic2);
            //schoolManager.enrollStudent(student1);
            //schoolManager.enrollStudent(student2);
            cleanScreen();
            //schoolManager.enrollTopicToCourse(topic1, course1);
            //schoolManager.enrollTopicToCourse(topic2, course1);
            //schoolManager.assignStudent(course1, student1);
            //schoolManager.assignStudent(course1, student2);
            //schoolManager.assignProfessor(course1, teacher1);
            //schoolManager.enrollProfessor(teacher1);
            //schoolManager.showStudentsInCourse(course1);
            //schoolManager.showCourses();
            //schoolManager.calculateHours(course1);
            //schoolManager.assignSubject(topic1, teacher1);
            //schoolManager.calculateSalary(teacher1);

            schoolManager.enrollCourse(course1);
            schoolManager.enrollCourse(course2);
            schoolManager.assignProfessor(course2, teacher1);
            schoolManager.showCourses();
        }
    
        public static void cleanScreen() {
            System.out.print("\033[H\033[2J");
            System.out.flush();

        
    }

}
