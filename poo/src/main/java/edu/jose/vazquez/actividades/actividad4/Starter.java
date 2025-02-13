package edu.jose.vazquez.actividades.actividad4;
import edu.jose.vazquez.actividades.actividad4.models.Course;
import edu.jose.vazquez.actividades.actividad4.models.Student;
import edu.jose.vazquez.actividades.actividad4.models.Teacher;
import edu.jose.vazquez.actividades.actividad4.models.Subject;
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

            cleanScreen();

            schoolManager.enrollTeacher(teacher1);
            schoolManager.enrollTeacher(teacher2);


            schoolManager.assignSubjectToCourse(topic1, course2);
            schoolManager.assignSubjectToTeacher(topic2, teacher1);
            schoolManager.assignSubjectToTeacher(topic3, teacher1);
            schoolManager.assignSubjectToTeacher(topic4, teacher1);
            schoolManager.assignSubjectToCourse(topic6, course2);
            schoolManager.assignSubjectToCourse(topic5, course2);

            schoolManager.calculateSalary(teacher1);
            schoolManager.calculateSalary(teacher2);

            schoolManager.showSubjectsInCourse(course2);
            

            schoolManager.showTeachersInCourse(course2);
        }
    
        public static void cleanScreen() {
            System.out.print("\033[H\033[2J");
            System.out.flush();

        
    }

}
