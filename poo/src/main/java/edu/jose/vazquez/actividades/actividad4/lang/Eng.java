package edu.jose.vazquez.actividades.actividad4.lang;

public class Eng extends Lang{
    /**
     * Constructor de la clase Eng que inicializa los mensajes en inglés para la aplicación
     */
    public Eng(){SELECT_AN_OPTION = "Select an option: ";
    INVALID_INPUT_EMPTY = "Invalid input. You can't leave the field empty.";
    INVALID_OPTION = "Invalid option. Please, enter a number from the menu.";
    INVALID_INPUT_NOT_NUMBER = "Invalid input. Please, enter a number.";
    INVALID_INPUT_NEGATIVE_NUMBER = "Invalid input. Please, enter a positive number.";
    GOODBYE =
    "╔══════════╗\n" +
    "║ Goodbye! ║\n" +
    "╚══════════╝\n";
    LANGUAGE_MENU_TOP = "\n╔══════════════════════════════════════════════╗\n║   Your system language is : ";
    LANGUAGE_MENU_BOTTOM = "           ║\n║   Would you like to change the language?     ║\n╠══════════════════════════════════════════════╣\n║                  1. Spanish                  ║\n║                  2. English                  ║\n║                  3. Exit                     ║\n╚══════════════════════════════════════════════╝";
    SHOW_MENU =        
    "+----------------------------------------------------+\n" +
    "|            Main Menu                               |\n" +
    "+----------------------------------------------------+\n" +
    "| 1. Register a student                              |\n" +
    "| 2. Register a teacher                              |\n" +
    "| 3. Create an empty course                          |\n" +
    "| 4. Create subjects for a course                    |\n" +
    "| 5. Assign a student to a course                    |\n" +
    "| 6. Assign subjects to an empty course              |\n" +
    "| 7. Show students enrolled in a course              |\n" +
    "| 8. Show teachers of a course                       |\n" +
    "| 9. Records of created courses                      |\n" +
    "| 10. Records of enrolled students                   |\n" +
    "| 11. Records of hired teachers                      |\n" +
    "| 12. Records of taught subjects                     |\n" +
    "| 13. Calculate a teacher's salary                   |\n" +
    "| 14. Calculate hours and credits of a course        |\n" +
    "| 15. Exit                                           |\n" +
    "+----------------------------------------------------+";

    STUDENT_NAME = "Student's name: ";
    STUDENT_NAME_HEADLINER = "╔════════════════════════╗\n" +
                           "║   Enter Student name   ║\n" +
                           "╚════════════════════════╝";
    STUDENT_ID = "Student's ID: ";
    STUDENT_ID_HEADLINER = "╔═══════════════════╗\n" +
                         "║  Enter Student ID ║\n" +
                         "╚═══════════════════╝";
    STUDENT_AGE = "Student's age: ";
    STUDENT_AGE_HEADLINER =
    "╔═════════════════════╗\n" +
    "║  Enter Student age  ║\n" +
    "╚═════════════════════╝";

    STUDENT_ENROLLMENT = "Student's enrollment: ";
    STUDENT_ENROLLMENT_HEADLINER = "╔══════════════════════════════════════════════════════╗\n" +
                                 "║  Enter the course you want to enroll the student in. ║\n" +
                                 "╚══════════════════════════════════════════════════════╝";
    STUDENT_ADDED =
    "╔════════════════════════════╗\n" +
    "║  Student added correctly   ║\n" +
    "╚════════════════════════════╝\n";
   // Profesores
    TEACHER_NAME = "Teacher's name: ";
    TEACHER_NAME_HEADLINER = "╔══════════════════════╗\n" +
                           "║  Enter Teacher name  ║\n" +
                           "╚══════════════════════╝";
    TEACHER_PAYROLL = "Teacher's payroll: ";
    TEACHER_PAYROLL_HEADLINER = "╔═════════════════════════╗\n" +
                              "║  Enter Teacher payroll  ║\n" +
                              "╚═════════════════════════╝";
    TEACHER_SALARY = "Teacher's salary: ";
    TEACHER_SALARY_HEADLINER = "╔═══════════════════════╗\n" +
                             "║ Enter Teacher salary  ║\n" +
                             "╚═══════════════════════╝";
    TEACHER_SUBJECT = "Teacher's subject: ";
    TEACHER_SUBJECT_HEADLINER = "╔════════════════════════════════════════════════════════╗\n" +
                              "║  Enter the subject that the teacher is going to teach  ║\n" +
                              "╚════════════════════════════════════════════════════════╝";
    TEACHER_ADDED =
    "╔════════════════════════════╗\n" +
    "║  Teacher added correctly   ║\n" +
    "╚════════════════════════════╝\n";
   // Cursos
    COURSE_NAME = "Course's name: ";
    COURSE_NAME_HEADLINER = "╔════════════════════════════════════════════════╗\n" +
                          "║   Enter the name you want the course to have   ║\n" +
                          "╚════════════════════════════════════════════════╝";
    COURSE_TOPIC_NAME = "Enter the topic that composes the course: ";
    COURSE_TOPIC_NAME_HEADLINER = "╔════════════════════════════════════════════════════════╗\n" +
                                "║ Enter the name of the subject that makes up the course ║\n" +
                                "╚════════════════════════════════════════════════════════╝";
    COURSE_TOPIC_ID = "Enter the topic's ID: ";
    COURSE_TOPIC_ID_HEADLINER = "╔══════════════════════════════════════════════════════════╗\n" +
                              "║   Enter the ID of the subject that makes up the course   ║\n" +
                              "╚══════════════════════════════════════════════════════════╝";
    COURSE_TOPIC_CREDITS = "Enter the topic's credits: ";
    COURSE_TOPIC_CREDITS_HEADLINER = "╔═══════════════════════════════════════════════════╗\n" +
                                   "║      Enter the credits that the subject has       ║\n" +
                                   "╚═══════════════════════════════════════════════════╝";
    COURSE_TOPIC_HOURS = "Enter the topic's hours: ";
    COURSE_TOPIC_HOURS_HEADLINER = "╔═══════════════════════════════════════════════════════╗\n" +
                                 "║ Enter the total hours that the subject will be taught ║\n" +
                                 "╚═══════════════════════════════════════════════════════╝";
    COURSE_ADDED =
    "╔═══════════════════════════╗\n" +
    "║  Course added correctly   ║\n" +
    "╚═══════════════════════════╝\n";

   // Mostrar profesores
    SHOW_TEACHERS = "Hired professors";
    SHOW_TEACHERS_MENU = "╔═══════════════════╗\n" +
    "║    Teachers       ║\n" +
    "╚═══════════════════╝\n" +
    "╔═══════════════════╗";
    SHOW_TEACHERS_MENU_NAME = "║ Name: ";
    SHOW_TEACHERS_MENU_PAYROLL = "║ Payroll: ";
    SHOW_TEACHERS_MENU_SALARY = "║ Salary: ";
    SHOW_TEACHERS_MENU_SUBJECT = "║ Subject: ";
    SHOW_TEACHERS_MENU_BOTTOM = "╚═══════════════════╝";
   
    // Mostrar alumnos
    SHOW_STUDENTS = "Enrolled students";
    SHOW_STUDENTS_MENU = "╔═══════════════════╗\n" +
    "║    Students       ║\n" +
    "╚═══════════════════╝\n" +
    "╔═══════════════════╗";
    SHOW_STUDENTS_MENU_NAME = "║ Name: ";
    SHOW_STUDENTS_MENU_ID = "║ ID: ";
    SHOW_STUDENTS_MENU_AGE = "║ Age: ";
    SHOW_STUDENTS_MENU_ENROLLMENT = "║ Enrollment: ";
    SHOW_STUDENTS_MENU_BOTTOM = "╚═══════════════════╝";

   // Mostrar cursos
    SHOW_COURSES = "Current courses";
    SHOW_COURSES_MENU = "╔═══════════════════╗\n" +
    "║    Courses        ║\n" +
    "╚═══════════════════╝\n" +
    "╔═══════════════════╗";
    SHOW_COURSES_MENU_NAME = "║ Name: ";
    SHOW_COURSES_MENU_TOPICS = "║ Topics: ";
    SHOW_COURSES_MENU_CREDITS = "║ Credits: ";
    SHOW_COURSES_MENU_HOURS = "║ Hours: ";
    SHOW_COURSES_MENU_BOTTOM = "╚═══════════════════╝";


    //Nuevos de CLI
    INVALID_SELECTION =
    "╔══════════════════════╗\n" +
    "║   Invalid selection  ║\n" +
    "╚══════════════════════╝\n";
    STUDENT_TO_ENROLL =
    "╔═══════════════════════════════════════╗\n" +
    "║ Select the student you want to enroll ║\n" +
    "╚═══════════════════════════════════════╝\n";
    NO_STUDENTS_ENROLLED =
    "╔════════════════════════════════════════════════════════╗\n" +
    "║ No students registered. Please register students first.║\n" +
    "╚════════════════════════════════════════════════════════╝\n";
    NO_AVAILABLE_STUDENTS =
    "╔══════════════════════════════════════╗\n" +
    "║ No more students available to enroll ║\n" +
    "╚══════════════════════════════════════╝\n";

    AVAILABLE_STUDENTS =
    "╔═══════════════════════╗\n" +
    "║   Available students  ║\n" +
    "╚═══════════════════════╝\n";
    SELECT_STUDENT = "Select a student (enter the number):";
    CANCELING =
    "╔════════════╗\n" +
    "║ Canceling... ║\n" +
    "╚════════════╝\n";

    NO_AVAILABLE_COURSES =
    "╔════════════════════════╗\n" +
    "║ No courses available   ║\n" +
    "╚════════════════════════╝\n";

    NO_AVAILABLE_COURSES_TO_ENROLL =
    "╔═════════════════════════════════════╗\n" +
    "║ No more courses available to enroll ║\n" +
    "╚═════════════════════════════════════╝\n";

    AVAILABLE_COURSES =
    "╔═══════════════════════╗\n" +
    "║   Available courses   ║\n" +
    "╚═══════════════════════╝\n";
    SUBJECT_TO_ENROLL =
    "╔════════════════════════════════════════════╗\n" +
    "║ Select the subject you want to assign      ║\n" +
    "╚════════════════════════════════════════════╝\n";

    NO_SUBJECT_ENROLLED =
    "╔════════════════════════════════════════════════════════╗\n" +
    "║ No subjects registered. Please register subjects first.║\n" +
    "╚════════════════════════════════════════════════════════╝\n";
    SHOW_SUBJECTS_HEADLINER =
        "╔═══════════════════╗\n" +
        "║      Subjects     ║\n" +
        "╚═══════════════════╝\n" +
        "╔═══════════════════╗";
        SHOW_SUBJECTS_NAME = "║ Name: ";
        SHOW_SUBJECTS_ID = "║ ID: ";
        SHOW_SUBJECTS_CREDITS = "║ Credits: ";
        SHOW_SUBJECTS_HOURS = "║ Hours: ";
        SHOW_SUBJECTS_BOTTOM = "╚═══════════════════╝";
    NO_AVAILABLE_SUBJECTS =
    "╔════════════════════════════════════════════╗\n" +
    "║  No more subjects available to assign      ║\n" +
    "╚════════════════════════════════════════════╝\n";
    SUBJECT_ADDED =
    "╔══════════════════════════╗\n" +
    "║  Subject added correctly ║\n" +
    "╚══════════════════════════╝";

    AVAILABLE_SUBJECTS =
    "╔═══════════════════════╗\n" +
    "║  Available subjects   ║\n" +
    "╚═══════════════════════╝\n";
    SELECT_COURSE = "Select a course:";
    SELECT_SUBJECT = "Select a subject (enter the number):";
    NO_AVAILABLE_COURSE =
    "╔════════════════════════╗\n" +
    "║  No courses available  ║\n" +
    "╚════════════════════════╝\n";
    NO_AVAILABLE_COURSE_TO_ASSING =
    "╔══════════════════════════════════════════════════════════╗\n" +
    "║  No more courses available to assign subjects.           ║\n" +
    "╚══════════════════════════════════════════════════════════╝\n";

    NO_REGISTERED_COURSES =
    "╔═══════════════════════════════════════════════════════╗\n" +
    "║ No courses registered. Please register courses first. ║\n" +
    "╚═══════════════════════════════════════════════════════╝\n";

    TEACHER_TO_CALCULATE_SALARY =
    "╔════════════════════════════════════════════════════════╗\n" +
    "║ Select the teacher whose salary you want to calculate. ║\n" +
    "╚════════════════════════════════════════════════════════╝\n";

    NOT_REGISTERED_TEACHERS =
    "╔═════════════════════════════════════════════════════════╗\n" +
    "║ No teachers registered. Please register teachers first. ║\n" +
    "╚═════════════════════════════════════════════════════════╝\n";
    AVAILABLE_TEACHERS =
    "╔════════════════════════╗\n" +
    "║   Available teachers   ║\n" +
    "╚════════════════════════╝\n";
    SELECT_TEACHER = "Select a teacher (enter the number):";
    COURSE_TO_CALCULATE_HOUR =
    "╔══════════════════════════════════════════════════════════════════════╗\n" +
    "║ Select the course for which you want to calculate hours and credits. ║\n" +
    "╚══════════════════════════════════════════════════════════════════════╝\n";


    }
}
