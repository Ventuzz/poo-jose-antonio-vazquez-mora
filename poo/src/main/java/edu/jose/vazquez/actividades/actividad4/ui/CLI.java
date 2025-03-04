package edu.jose.vazquez.actividades.actividad4.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
        /**
         * Método para seleccionar el idioma de la aplicación 
         */
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
            System.out.println(lang.LANGUAGE_MENU_TOP+ systemLocale + lang.LANGUAGE_MENU_BOTTOM);
            while (true) {
                System.out.print(lang.SELECT_AN_OPTION);
                String input = scanner.nextLine().trim(); 
                if (input.isEmpty()) {
                    System.out.println(lang.INVALID_INPUT_EMPTY);
                    continue;
                }
    
                try {
                    opcion = Integer.parseInt(input);
                    if (opcion < 1 || opcion > 3) {
                        System.out.println(lang.INVALID_OPTION);
                        System.out.println(lang.LANGUAGE_MENU_TOP+ systemLocale + lang.LANGUAGE_MENU_BOTTOM);
                    } else {
                        break; 
                    }
                } catch (NumberFormatException e) {
                    System.out.println(lang.INVALID_INPUT_NOT_NUMBER);
                    System.out.println(lang.LANGUAGE_MENU_TOP+ systemLocale + lang.LANGUAGE_MENU_BOTTOM);
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
                    System.out.println(lang.GOODBYE);
                    break;
            }
            break;
        }
        
    }
        /**
         * Método para limpiar la consola de la aplicación
         */
        public static void cleanScreen(){
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (IOException | InterruptedException ex) {
                System.out.println("Error al limpiar la consola.");
            }
        }
    /**
     * Método para ejecutar la aplicación de la escuela
     */
    public static void runApp() {
        schoolManager.dataBase();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1; 
        while (opcion !=15) {
            showMenu();
            while (true) {
                System.out.print(lang.SELECT_AN_OPTION);
                String input = scanner.nextLine().trim(); 
    
                if (input.isEmpty()) {
                    System.out.println(lang.INVALID_INPUT_EMPTY);
                    showMenu();
                    continue;
                }
                
                try {
                    opcion = Integer.parseInt(input);
                    if (opcion < 1 || opcion > 15) {
                        System.out.println(lang.INVALID_OPTION);

                        showMenu();
                    } else {
                        break; 
                    }
                } catch (NumberFormatException e) {
                    System.out.println(lang.INVALID_INPUT_NOT_NUMBER);

                    showMenu();
                }
            }
            /**
             * Switch para seleccionar la opción del menú
             */
            switch (opcion) {
                /**
                 * Caso para añadir un estudiantes a la escuela
                 */
                case 1:
                    System.out.println(lang.STUDENT_ID_HEADLINER);
                    String studentId;
                    while (true) {
                        System.out.print(lang.STUDENT_ID);
                        studentId = scanner.nextLine().trim();
                        if (studentId.isEmpty()) {
                            System.out.println(lang.INVALID_INPUT_EMPTY);

                        } else {
                            break;
                        }
                    }
                    System.out.println(lang.STUDENT_NAME_HEADLINER);
                    String studentName;
                    while (true) {
                        System.out.print(lang.STUDENT_NAME);
                        studentName = scanner.nextLine().trim();
                        if (studentName.isEmpty()) {          
                            System.out.println(lang.INVALID_INPUT_EMPTY);
                        } else {
                            break;
                        }
                    }
                    System.out.println(lang.STUDENT_AGE_HEADLINER);
                    int studentAge;
                    while (true) {
                        System.out.print(lang.STUDENT_AGE);
                        String input = scanner.nextLine().trim();
                        if (input.isEmpty()) {
                            System.out.println(lang.INVALID_INPUT_EMPTY);
                            continue;
                        }
                        try {
                            studentAge = Integer.parseInt(input);
                            if (studentAge < 1) {
                                System.out.println(lang.INVALID_INPUT_NEGATIVE_NUMBER);
                                continue;
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(lang.INVALID_INPUT_NOT_NUMBER);
                        }
                    }
                    Student student = new Student(studentName, studentAge, studentId);
                    schoolManager.enrollStudent(student);
                    System.out.println(lang.STUDENT_ADDED);
                    break;
                /**
                 * Caso para añadir un profesor a la escuela
                 */
                case 2:
                    System.out.println(lang.TEACHER_NAME_HEADLINER);
                    String teacherName;
                    while (true) {
                        System.out.print(lang.TEACHER_NAME);
                        teacherName = scanner.nextLine().trim();
                        if (teacherName.isEmpty()) {
                            System.out.println(lang.INVALID_INPUT_EMPTY);
                        } else {
                            break;
                        }
                    }
                    System.out.println(lang.TEACHER_PAYROLL_HEADLINER);
                    String teacherPayroll;
                    while (true) {
                        System.out.print(lang.TEACHER_PAYROLL);
                        teacherPayroll = scanner.nextLine().trim();
                        if (teacherPayroll.isEmpty()) {
                            System.out.println(lang.INVALID_INPUT_EMPTY);
                        } else {
                            break;
                        }
                    }
                    Teacher teacher = new Teacher(teacherName, teacherPayroll);
                    schoolManager.enrollTeacher(teacher);
                    System.out.println(lang.TEACHER_ADDED);
                    break;
                /**
                 * Caso para añadir un curso a la escuela
                 */
                case 3:
                    System.out.println(lang.COURSE_NAME_HEADLINER);
                    String courseName;
                    while (true) {
                        System.out.print(lang.COURSE_NAME);
                        courseName = scanner.nextLine().trim();
                        if (courseName.isEmpty()) {
                            System.out.println(lang.INVALID_INPUT_EMPTY);
                        } else {
                            break;
                        }
                    }
                    Course course = new Course(courseName, new ArrayList<>());
                    schoolManager.enrollCourse(course);
                    System.out.println(lang.COURSE_ADDED);
                    break;
                /**
                 * Caso para añadir una materia a la escuela
                 */
                case 4:   
                    System.out.println(lang.COURSE_TOPIC_NAME_HEADLINER);
                    String topicName;
                    while (true) {
                        System.out.print(lang.COURSE_TOPIC_NAME);
                        topicName = scanner.nextLine().trim();
                        if (topicName.isEmpty()) {
                            System.out.println(lang.INVALID_INPUT_EMPTY);
                        } else {
                            break;
                        }
                    }
                    System.out.println(lang.COURSE_TOPIC_ID_HEADLINER);
                    String topicId;
                    while (true) {
                        System.out.print(lang.COURSE_TOPIC_ID);
                        topicId = scanner.nextLine().trim();
                        if (topicId.isEmpty()) {
                            System.out.println(lang.INVALID_INPUT_EMPTY);
                        } else {
                            break;
                        }
                    }
                    System.out.println(lang.COURSE_TOPIC_CREDITS_HEADLINER);
                    int topicCredits;
                    while (true) {
                        System.out.print(lang.COURSE_TOPIC_CREDITS);
                        String input = scanner.nextLine().trim();
                        if (input.isEmpty()) {
                            System.out.println(lang.INVALID_INPUT_EMPTY);
                            continue;
                        }
                        try {
                            topicCredits = Integer.parseInt(input);
                            if (topicCredits < 1) {
                                System.out.println(lang.INVALID_INPUT_NEGATIVE_NUMBER);
                                continue;
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(lang.INVALID_INPUT_NOT_NUMBER);
                        }
                    }
                    System.out.println(lang.COURSE_TOPIC_HOURS_HEADLINER);
                    int topicHours;
                    while (true) {
                        System.out.print(lang.COURSE_TOPIC_HOURS);
                        String input = scanner.nextLine().trim();
                        if (input.isEmpty()) {
                            System.out.println(lang.INVALID_INPUT_EMPTY);
                            continue;
                        }
                        try {
                            topicHours = Integer.parseInt(input);
                            if (topicHours < 1) {
                                System.out.println(lang.INVALID_INPUT_NEGATIVE_NUMBER);
                                continue;
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(lang.INVALID_INPUT_NOT_NUMBER);
                        }
                    }
                    Subject subject = new Subject(topicName, topicId, topicCredits, topicHours);
                    schoolManager.enrollSubject(subject);
                    System.out.println(lang.SUBJECT_ADDED);             
                    break;
                /**
                 * Caso para matricular un estudiante en un curso
                 */
                case 5: 
                System.out.println(lang.STUDENT_TO_ENROLL);
                if (schoolManager.studentMap.isEmpty()) {
                    System.out.println(lang.NO_STUDENTS_ENROLLED);
                    return;
                }
                while (true) {
                    List<Student> studentList = new ArrayList<>(schoolManager.studentMap.keySet());
                    studentList.removeIf(student1 -> schoolManager.studentCourseMap.values().stream()
                            .anyMatch(list -> list.contains(student1)));
                    if (studentList.isEmpty()) {
                        System.out.println(lang.NO_AVAILABLE_STUDENTS);
                        return;
                    }
                    System.out.println(lang.AVAILABLE_STUDENTS);
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println((i + 1) + ". " + studentList.get(i).getName());
                    }
                    
                    System.out.print("\n"+lang.SELECT_STUDENT);
                    int studentIndex;
                    try {
                        studentIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        if (studentIndex == -1) {
                            System.out.println(lang.CANCELING);
                            return;
                        }
                        if (studentIndex < 0 || studentIndex >= studentList.size()) {
                            System.out.println(lang.INVALID_SELECTION);
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(lang.INVALID_INPUT_NOT_NUMBER);
                        continue;
                    }
                    Student studentAvailable = studentList.get(studentIndex);
                    if (schoolManager.courseMap.isEmpty()) {
                        System.out.println(lang.NO_AVAILABLE_COURSE);
                        return;
                    }
                    while (true) {
                        List<Course> courseList = new ArrayList<>(schoolManager.courseMap.keySet());
                        courseList.removeIf(course1 -> schoolManager.studentCourseMap.getOrDefault(course1, new ArrayList<>()).size() >= 26);
                        if (courseList.isEmpty()) {
                            System.out.println(lang.NO_AVAILABLE_COURSES_TO_ENROLL);
                            return;
                        }
                        System.out.println(lang.AVAILABLE_COURSES);
                        for (int i = 0; i < courseList.size(); i++) {
                            System.out.println((i + 1) + ". " + courseList.get(i).getName());
                        }
                        System.out.print("\n"+lang.SELECT_COURSE);
                        int courseIndex;
                        try {
                            courseIndex = Integer.parseInt(scanner.nextLine()) - 1;
                            if (courseIndex == -1) {
                                System.out.println(lang.CANCELING);
                                return;
                            }
                            if (courseIndex < 0 || courseIndex >= courseList.size()) {
                                System.out.println(lang.INVALID_SELECTION);
                                continue;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(lang.INVALID_INPUT_NOT_NUMBER);
                            continue;
                        }
                        Course courseAvailable = courseList.get(courseIndex);
                        try {
                            System.out.println();
                            schoolManager.assignStudentToCourse(studentAvailable, courseAvailable);
                            
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            break;
                        }
                        
                        break;
                    }
                    
                    break;
                }
                break;
                /**
                 *  Caso para asignar una materia a un curso
                 */
                case 6: 
                System.out.println(lang.SUBJECT_TO_ENROLL);
                if (schoolManager.subjectMap.isEmpty()) {
                    System.out.println(lang.NO_SUBJECT_ENROLLED);
                    return;
                }
                while (true) {
                    List<Subject> subjectList = new ArrayList<>(schoolManager.subjectMap.keySet());
                    subjectList.removeIf(Subject -> schoolManager.courseMap.values().stream()
                            .anyMatch(subjects -> subjects.contains(Subject)));
                
                    if (subjectList.isEmpty()) {
                        System.out.println(lang.NO_AVAILABLE_SUBJECTS);
                        return;
                    }
                
                    System.out.println(lang.AVAILABLE_SUBJECTS);
                    for (int i = 0; i < subjectList.size(); i++) {
                        System.out.println((i + 1) + ". " + subjectList.get(i).getName());
                    }
                    
                    System.out.print("\n"+lang.SELECT_SUBJECT);
                    int subjectIndex1;
                    try {
                        subjectIndex1 = Integer.parseInt(scanner.nextLine()) - 1;
                        if (subjectIndex1 == -1) {
                            System.out.println(lang.CANCELING);
                            return;
                        }
                        if (subjectIndex1 < 0 || subjectIndex1 >= subjectList.size()) {
                            System.out.println(lang.INVALID_SELECTION);
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(lang.INVALID_INPUT_NOT_NUMBER);
                        continue;
                    }
                    Subject subjectAvailable1 = subjectList.get(subjectIndex1);
                    if (schoolManager.courseMap.isEmpty()) {
                        System.out.println(lang.NO_AVAILABLE_COURSE);
                        return;
                    }
                    while (true) {
                        List<Course> courseListAvailable = new ArrayList<>(schoolManager.courseMap.keySet());
                        courseListAvailable.removeIf(course1 -> schoolManager.courseMap.get(course1).size() >= 3);
                        if (courseListAvailable.isEmpty()) {
                            System.out.println(lang.NO_AVAILABLE_COURSE_TO_ASSING);
                            return;
                        }
                        System.out.println(lang.AVAILABLE_COURSES);
                        for (int i = 0; i < courseListAvailable.size(); i++) {
                            System.out.println((i + 1) + ". " + courseListAvailable.get(i).getName());
                        }
                        System.out.print("\n"+lang.SELECT_COURSE);
                        int courseIndex1;
                        try {
                            courseIndex1 = Integer.parseInt(scanner.nextLine()) - 1;
                            if (courseIndex1 == -1) {
                                System.out.println(lang.CANCELING);
                                return;
                            }
                            if (courseIndex1 < 0 || courseIndex1 >= courseListAvailable.size()) {
                                System.out.println(lang.INVALID_SELECTION);
                                continue;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(lang.INVALID_INPUT_NOT_NUMBER);
                            continue;
                        }
                        System.out.println();
                        Course courseAvailable1 = courseListAvailable.get(courseIndex1);
                        schoolManager.assignSubjectToCourse(subjectAvailable1, courseAvailable1);
                        System.out.println(lang.SUBJECT_ADDED);

                        break;
                    }
                    break;
                }
                break;
                /**
                 * Caso para mostrar los estudiantes en un curso
                 */
                case 7: 
                if (schoolManager.courseMap.isEmpty()) {
                    System.out.println(lang.COURSE_TO_ASSING);
                    break;
                }
                System.out.println(lang.AVAILABLE_COURSES);
                List<Course> availCourseList = new ArrayList<>(schoolManager.courseMap.keySet());
                for (int i = 0; i < availCourseList.size(); i++) {
                    System.out.println((i + 1) + ". " + availCourseList.get(i).getName());
                }
                System.out.print(lang.SELECT_COURSE);
                int selectedCourseIndex;
                try {
                    selectedCourseIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    if (selectedCourseIndex < 0 || selectedCourseIndex >= availCourseList.size()) {
                        System.out.println(lang.INVALID_SELECTION);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println(lang.INVALID_INPUT_NOT_NUMBER);
                    break;
                }
                Course selectedCourse = availCourseList.get(selectedCourseIndex);
                schoolManager.showStudentsInCourse(selectedCourse);
                break;
                /**
                 * Caso para mostrar los profesores en un curso
                 */
                case 8: 
                if (schoolManager.courseMap.isEmpty()) {
                    System.out.println(lang.COURSE_TO_ASSING);
                    break;
                }
                System.out.println(lang.AVAILABLE_COURSES);
                List<Course> availCourseList1 = new ArrayList<>(schoolManager.courseMap.keySet());
                for (int i = 0; i < availCourseList1.size(); i++) {
                    System.out.println((i + 1) + ". " + availCourseList1.get(i).getName());
                }
                System.out.print(lang.SELECT_COURSE);
                int selectedCourseIndex1;
                try {
                    selectedCourseIndex1 = Integer.parseInt(scanner.nextLine()) - 1;
                    if (selectedCourseIndex1 < 0 || selectedCourseIndex1 >= availCourseList1.size()) {
                        System.out.println(lang.INVALID_SELECTION);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println(lang.INVALID_INPUT_NOT_NUMBER);
                    break;
                }
                Course selectedCourse1 = availCourseList1.get(selectedCourseIndex1);
                schoolManager.showTeachersInCourse(selectedCourse1);
                    break;
                /**
                 * Caso para mostrar los cursos registrados en la escuela
                 */
                case 9: 
                    showCourses();
                    System.out.println();
                    break;
                /**
                 * Caso para mostrar los estudiantes registrados en la escuela
                 */
                case 10: 
                    showStudents();
                    break;
                /**
                 * Caso para mostrar los profesores registrados en la escuela
                 */
                case 11: 
                    showTeachers();
                    break;
                /**
                 * Caso para mostrar las materias registradas en la escuela
                 */
                case 12: 
                    showSubjects();
                    break;
                /**
                 * Caso para calcular el salario de un profesor
                 */
                case 13: 
                    System.out.println(lang.TEACHER_TO_CALCULATE_SALARY);
                    if (schoolManager.teacherMap.isEmpty()) {
                        System.out.println(lang.NOT_REGISTERED_TEACHERS);
                        return;
                    }
                    while (true) {
                        List<Teacher> teacherList = new ArrayList<>(schoolManager.teacherMap.keySet());
                        System.out.println(lang.AVAILABLE_TEACHERS);
                        for (int i = 0; i < teacherList.size(); i++) {
                            System.out.println((i + 1) + ". " + teacherList.get(i).getName());
                        }
                        System.out.print(lang.SELECT_TEACHER);
                        int teacherIndex;
                        try {
                            teacherIndex = Integer.parseInt(scanner.nextLine()) - 1;
                            if (teacherIndex == -1) {
                                System.out.println(lang.CANCELING);
                                return;
                            }
                            if (teacherIndex < 0 || teacherIndex >= teacherList.size()) {
                                System.out.println(lang.INVALID_SELECTION);
                                continue;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(lang.INVALID_INPUT_NOT_NUMBER);
                            continue;
                        }
                        Teacher teacherAvailable = teacherList.get(teacherIndex);
                        schoolManager.calculateSalary(teacherAvailable);
                        break;
                    }
                    break;
                /**
                 * Caso para calcular el salario de un profesor
                 */
                case 14: 
                    System.out.println(lang.COURSE_TO_CALCULATE_HOUR);
                    if (schoolManager.courseMap.isEmpty()) {
                        System.out.println(lang.COURSE_TO_ASSING);
                        return;
                    }
                    while (true) {
                        List<Course> courseList = new ArrayList<>(schoolManager.courseMap.keySet());
                        System.out.println(lang.AVAILABLE_COURSES);
                        for (int i = 0; i < courseList.size(); i++) {
                            System.out.println((i + 1) + ". " + courseList.get(i).getName());
                        }
                        System.out.print(lang.SELECT_COURSE);
                        int courseIndex;
                        try {
                            courseIndex = Integer.parseInt(scanner.nextLine()) - 1;
                            if (courseIndex == -1) {
                                System.out.println(lang.CANCELING);
                                return;
                            }
                            if (courseIndex < 0 || courseIndex >= courseList.size()) {
                                System.out.println(lang.INVALID_SELECTION);
                                continue;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(lang.INVALID_INPUT_NOT_NUMBER);
                            continue;
                        }
                        Course courseAvailable = courseList.get(courseIndex);
                        schoolManager.calculateHoursAndCredits(courseAvailable);
                        break;
                    }
                    break;
                /**
                 * caso para salir de la aplicación
                 */
                case 15: 
                    System.out.println(lang.GOODBYE);
                    break;
            }
        }
    }

    
    /**
     * Método para mostrar el menú de la aplicación en la consola
     */
    public static void showMenu(){
        System.out.println(lang.SHOW_MENU);
    }
    /**
     * Método para mostrar los profesores registrados en la escuela
     */
    public static void showTeachers() {
        if (schoolManager.teacherMap.isEmpty()) {
            System.out.println(lang.NOT_REGISTERED_TEACHERS);
            return;
        }
        for (Map.Entry<Teacher, List<Subject>> entry : schoolManager.teacherMap.entrySet()) {
            Teacher teacher = entry.getKey();
            List<Subject> subjects = entry.getValue();
            System.out.println(lang.SHOW_TEACHERS_MENU);
            System.out.println(lang.SHOW_TEACHERS_MENU_NAME+ teacher.getName() + "\n"+ lang.SHOW_TEACHERS_MENU_PAYROLL+ teacher.getPayroll()+ "\n"+ lang.SHOW_TEACHERS_MENU_BOTTOM);
            for (Subject subject : subjects) {
                System.out.println(lang.SHOW_COURSES_MENU_NAME + subject.getName() + lang.SHOW_COURSES_MENU_HOURS + subject.getHours() + lang.SHOW_COURSES_MENU_CREDITS + subject.getCredits()+ lang.SHOW_COURSES_MENU_BOTTOM);
            }
        }
    }
    /**
     * Método para mostrar los cursos registrados en la escuela
     */
    public static void showCourses() {
        if (schoolManager.courseMap.isEmpty()) {
            System.out.println(lang.NO_REGISTERED_COURSES);
            return;
        }

        for (Map.Entry<Course, List<Subject>> entry : schoolManager.courseMap.entrySet()) {
            Course course = entry.getKey();
            List<Subject> subjects = entry.getValue();
            Teacher teacher = schoolManager.courseTeacherMap.get(course);
            System.out.println(lang.SHOW_COURSES_MENU);
            System.out.println(lang.SHOW_COURSES_MENU_NAME + course.getName());
            if (teacher != null) {
                System.out.println(lang.TEACHER_WITH_COLON + teacher.getName());
            }

            for (Subject subject : subjects) {
                System.out.println(lang.SHOW_COURSES_MENU_TOPICS + subject.getName() + "\n"+lang.SHOW_COURSES_MENU_HOURS+ subject.getHours() + "\n"+lang.SHOW_COURSES_MENU_CREDITS+ subject.getCredits()+ "\n"+ lang.SHOW_COURSES_MENU_BOTTOM);
            }
        }
    }
    /**
     * Método para mostrar los estudiantes registrados en la escuela
     */
    public static void showStudents() {
        if (schoolManager.studentMap.isEmpty()) {
            System.out.println(lang.NO_ENROLLED_STUDENTS);
            return;
        }
        for (Map.Entry<Student, List<Student>> entry : schoolManager.studentMap.entrySet()) {
            Student student = entry.getKey();
            List<Student> students = entry.getValue();
            System.out.println(lang.SHOW_STUDENTS_MENU);
            System.out.println(lang.SHOW_STUDENTS_MENU_NAME + student.getName() + "\n"+ lang.SHOW_STUDENTS_MENU_AGE+ student.getAge() + "\n"+ lang.SHOW_STUDENTS_MENU_ID+ student.getId()+ "\n"+ lang.SHOW_STUDENTS_MENU_BOTTOM);
            for (Student student1 : students) {
                System.out.println(" - " + student1.getName());
            }
        }

    } 
    /**
     * Método para mostrar las materias registradas en la escuela
     */
    public static void showSubjects() {
        if (schoolManager.subjectMap.isEmpty()) {
            System.out.println(lang.NOT_REGISTERED_TOPICS);
            return;
        }

        for (Map.Entry<Subject, List<Subject>> entry : schoolManager.subjectMap.entrySet()) {
            Subject subject = entry.getKey();
            List<Subject> subjects = entry.getValue();
            System.out.println(lang.SHOW_SUBJECTS_HEADLINER);
            System.out.println(lang.SHOW_SUBJECTS_NAME + subject.getName() + "\n"+ lang.SHOW_SUBJECTS_ID+ subject.getId() + "\n"+ lang.SHOW_SUBJECTS_CREDITS+ subject.getCredits() + "\n"+ lang.SHOW_SUBJECTS_HOURS+ subject.getHours() + "\n"+ lang.SHOW_SUBJECTS_BOTTOM);
            for (Subject subject1 : subjects) {
                System.out.println(" - " + subject1.getName());
            }
        }
        
    }
}
