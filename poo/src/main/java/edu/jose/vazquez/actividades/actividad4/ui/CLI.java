package edu.jose.vazquez.actividades.actividad4.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import edu.jose.vazquez.actividades.actividad4.lang.Eng;
import edu.jose.vazquez.actividades.actividad4.lang.Esp;
import edu.jose.vazquez.actividades.actividad4.lang.Lang;
import edu.jose.vazquez.actividades.actividad4.models.Course;
import edu.jose.vazquez.actividades.actividad4.models.Student;
import edu.jose.vazquez.actividades.actividad4.models.Subject;
import edu.jose.vazquez.actividades.actividad4.models.Teacher;
import edu.jose.vazquez.actividades.actividad4.process.SchoolManager;

public class CLI {
    private static Lang lang;
    static SchoolManager schoolManager = new SchoolManager();
        public static void selectLang(){
        cleanScreen();
        Locale systemLocale = Locale.getDefault();
        if (systemLocale.getLanguage().equals("es")) {
            lang= new Esp();
        } else if (systemLocale.getLanguage().equals("en")) {
            lang= new Eng();
        }else{
            lang= new Esp();
        }
        Scanner scanner=new Scanner(System.in);
        int opcion=-1;
        while (opcion!=3) {
            System.out.println(lang.language_menu_top+ systemLocale + lang.language_menu_bottom);
            while (true) {
                System.out.print(lang.select_an_option);
                String input = scanner.nextLine().trim(); 
                if (input.isEmpty()) {
                    System.out.println(lang.invalid_input_empty);
                    continue;
                }
    
                try {
                    opcion = Integer.parseInt(input);
                    if (opcion < 1 || opcion > 3) {
                        System.out.println(lang.invalid_option);
                        System.out.println(lang.language_menu_top+ systemLocale + lang.language_menu_bottom);
                    } else {
                        break; 
                    }
                } catch (NumberFormatException e) {
                    System.out.println(lang.invalid_input_not_number);
                    System.out.println(lang.language_menu_top+ systemLocale + lang.language_menu_bottom);
                }
            }
            switch (opcion) {
                case 1:
                    cleanScreen();
                    lang= new Esp();
                    break;

                case 2:
                    cleanScreen();
                    lang= new Eng();
                    break;
                case 3:
                    cleanScreen();
                    System.out.println(lang.goodbye);
                    break;
            }
            break;
        }
        
    }

        public static void cleanScreen(){
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (IOException | InterruptedException ex) {
                System.out.println("Error al limpiar la consola.");
            }
        }

    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1; 
        while (opcion !=7) {
            showMenu();
            while (true) {
                System.out.print(lang.select_an_option);
                String input = scanner.nextLine().trim(); 
    
                if (input.isEmpty()) {
                    System.out.println(lang.invalid_input_empty);
                    showMenu();
                    continue;
                }
    
                try {
                    opcion = Integer.parseInt(input);
                    if (opcion < 1 || opcion > 7) {
                        System.out.println(lang.invalid_option);

                        showMenu();
                    } else {
                        break; 
                    }
                } catch (NumberFormatException e) {
                    System.out.println(lang.invalid_input_not_number);

                    showMenu();
                }
            }
            switch (opcion) {
                case 1:
                    System.out.println(lang.student_id_headliner);
                    String studentId;
                    while (true) {
                        System.out.print(lang.student_id);
                        studentId = scanner.nextLine().trim();
                        if (studentId.isEmpty()) {
                            System.out.println(lang.invalid_input_empty);

                        } else {
                            break;
                        }
                    }
                    System.out.println(lang.student_name_headliner);
                    String studentName;
                    while (true) {
                        System.out.print(lang.student_name);
                        studentName = scanner.nextLine().trim();
                        if (studentName.isEmpty()) {          
                            System.out.println(lang.invalid_input_empty);
                        } else {
                            break;
                        }
                    }
                    System.out.println(lang.student_age_headliner);
                    int studentAge;
                    while (true) {
                        System.out.print(lang.student_age);
                        String input = scanner.nextLine().trim();
                        if (input.isEmpty()) {
                            System.out.println(lang.invalid_input_empty);
                            continue;
                        }
                        try {
                            studentAge = Integer.parseInt(input);
                            if (studentAge < 1) {
                                System.out.println(lang.invalid_input_negative_number);
                                continue;
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(lang.invalid_input_not_number);
                        }
                    }
                    Student student = new Student(studentName, studentAge, studentId);
                    schoolManager.enrollStudent(student);
                    System.out.println(lang.student_added);
                    break;

                case 2:
                    System.out.println(lang.teacher_name_headliner);
                    String teacherName;
                    while (true) {
                        System.out.print(lang.teacher_name);
                        teacherName = scanner.nextLine().trim();
                        if (teacherName.isEmpty()) {
                            System.out.println(lang.invalid_input_empty);
                        } else {
                            break;
                        }
                    }
                    System.out.println(lang.teacher_payroll_headliner);
                    String teacherPayroll;
                    while (true) {
                        System.out.print(lang.teacher_payroll);
                        teacherPayroll = scanner.nextLine().trim();
                        if (teacherPayroll.isEmpty()) {
                            System.out.println(lang.invalid_input_empty);
                        } else {
                            break;
                        }
                    }
                    Teacher teacher = new Teacher(teacherName, teacherPayroll);
                    schoolManager.enrollTeacher(teacher);
                    System.out.println(lang.teacher_added);
                    break;

                case 3:
                    System.out.println(lang.course_name_headliner);
                    String courseName;
                    while (true) {
                        System.out.print(lang.course_name);
                        courseName = scanner.nextLine().trim();
                        if (courseName.isEmpty()) {
                            System.out.println(lang.invalid_input_empty);
                        } else {
                            break;
                        }
                    }
                    Course course = new Course(courseName, new ArrayList<>());
                    schoolManager.enrollCourse(course);
                    System.out.println(lang.course_added);
                    break;
                case 4:   //crear una materia
                    System.out.println(lang.course_topic_name_headliner);
                    String topicName;
                    while (true) {
                        System.out.print(lang.course_topic_name);
                        topicName = scanner.nextLine().trim();
                        if (topicName.isEmpty()) {
                            System.out.println(lang.invalid_input_empty);
                        } else {
                            break;
                        }
                    }
                    System.out.println(lang.course_topic_id_headliner);
                    String topicId;
                    while (true) {
                        System.out.print(lang.course_topic_id);
                        topicId = scanner.nextLine().trim();
                        if (topicId.isEmpty()) {
                            System.out.println(lang.invalid_input_empty);
                        } else {
                            break;
                        }
                    }
                    System.out.println(lang.course_topic_credits_headliner);
                    int topicCredits;
                    while (true) {
                        System.out.print(lang.course_topic_credits);
                        String input = scanner.nextLine().trim();
                        if (input.isEmpty()) {
                            System.out.println(lang.invalid_input_empty);
                            continue;
                        }
                        try {
                            topicCredits = Integer.parseInt(input);
                            if (topicCredits < 1) {
                                System.out.println(lang.invalid_input_negative_number);
                                continue;
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(lang.invalid_input_not_number);
                        }
                    }
                    System.out.println(lang.course_topic_hours_headliner);
                    int topicHours;
                    while (true) {
                        System.out.print(lang.course_topic_hours);
                        String input = scanner.nextLine().trim();
                        if (input.isEmpty()) {
                            System.out.println(lang.invalid_input_empty);
                            continue;
                        }
                        try {
                            topicHours = Integer.parseInt(input);
                            if (topicHours < 1) {
                                System.out.println(lang.invalid_input_negative_number);
                                continue;
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(lang.invalid_input_not_number);
                        }
                    }
                    Subject subject = new Subject(topicName, topicId, topicCredits, topicHours);
                    schoolManager.enrollSubject(subject);             
                    break;
                case 5: //añadir estudiante a curso
                    System.out.println("selecciona el estudiante al que quieres inscribir");

                    

                    break;
                case 6: //asignar materia a un curso
                    
                    break;
                case 7: //Mostrar estudiantes en un curso
                    
                    break;
                case 8: //Mostrar profesores en un curso
                    
                    break;
                case 9: //Mostrar materias que imparte un profesor
                    
                    break;
                case 10: //Mostrar materias en un curso

                    break;
                case 11: //registro curso

                    break;
                case 12: //registro alumnos
                
                    break;
                case 13: //registro profesores
                    
                    break;
                case 14: //registro materias
                    
                    break;
                case 15: //calcular salario de un profesor
                    
                    break;
                case 16: //calcular horarios y creditos del curso
                    
                    break;
                case 17: //salir
                    System.out.println(lang.goodbye);
                    break;
            }
        }
    }

    
    
    public static void showMenu(){
        System.out.println(lang.showMenu);
    }
    public static void show_teachers(Teacher teacher){
        System.out.println(lang.show_teachers_menu);
        System.out.println(lang.show_teachers_menu_name + teacher.getName());
        System.out.println(lang.show_teachers_menu_payroll + teacher.getPayroll());
        System.out.println(lang.show_teachers_menu_salary + teacher.getSalary());
        System.out.println(lang.show_teachers_menu_subject + teacher.getSubject());
        System.out.println(lang.show_teachers_menu_bottom);
    }
    public static void show_students(Student student){
        System.out.println(lang.show_students_menu);
        System.out.println(lang.show_students_menu_name + student.getName());
        System.out.println(lang.show_students_menu_id + student.getId());
        System.out.println(lang.show_students_menu_age + student.getAge());
        System.out.println(lang.show_students_menu_enrollment + student.getEnrollment());
        System.out.println(lang.show_students_menu_bottom);
    }
    public static void show_courses(Course course){
        System.out.println(lang.show_courses_menu);
        System.out.println(lang.show_courses_menu_name + course.getName());
        System.out.println(lang.show_courses_menu_topics + course.getSubjects());
        System.out.println(lang.show_courses_menu_credits + course.getCredits());
        System.out.println(lang.show_courses_menu_hours + course.getHours());
        System.out.println(lang.show_courses_menu_bottom);

    }
}
