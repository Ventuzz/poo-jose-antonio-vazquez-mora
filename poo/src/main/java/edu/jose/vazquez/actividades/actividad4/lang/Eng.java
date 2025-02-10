package edu.jose.vazquez.actividades.actividad4.lang;

public class Eng extends Lang{
    public Eng(){
        select_an_option = "Select an option: ";
        invalid_input_empty = "Invalid input. You can't leave the field empty.";
        invalid_option = "Invalid option. Please, enter a number from the menu.";
        invalid_input_not_number = "Invalid input. Please, enter a number.";
        invalid_input_negative_number = "Invalid input. Please, enter a positive number.";
        goodbye = "Goodbye!";
        language_menu_top = "\n╔══════════════════════════════════════════════╗\n║   Your system languague is : ";
        language_menu_bottom = "           ║\n║   Would you like to change the language?     ║\n╠══════════════════════════════════════════════╣\n║                  1. Spanish                  ║\n║                  2. English                  ║\n║                  3. Exit                     ║\n╚══════════════════════════════════════════════╝";
        showMenu =         "+------------------------------------------+\n" +
        "|            Main Menu                    |\n" +
        "+------------------------------------------+\n" +
        "| 1. Add a student                        |\n" +
        "| 2. Add a professor                      |\n" +
        "| 3. Create a course                      |\n" +
        "| 4. Show hired professors                |\n" +
        "| 5. Show enrolled students               |\n" +
        "| 6. Show current courses                 |\n" +
        "| 7. Exit                                 |\n" +
        "+------------------------------------------+";
        student_name= "Student's name: ";
        student_id= "Student's ID: ";
        student_age= "Student's age: ";
        student_enrollment= "Student's enrollment: ";
        student_added= "Student added correctly";
       //profesores
        teacher_name= "Teacher's name: ";
        teacher_payroll= "Teacher's payroll: ";
        teacher_salary= "Teacher's salary: ";
        teacher_subject= "Teacher's subject: ";
        teacher_added= "Teacher added correctly";
       //cursos
        course_name= "Course's name: ";
        course_topic_name= "Enter the topic that composes the course: ";
        course_topic_id= "Enter the topic's ID: ";
        course_topic_credits= "Enter the topic's credits: ";
        course_topic_hours= "Enter the topic's hours: ";
        course_added= "Course added correctly";
       //mostrar profesores
        show_teachers = "Hired professors";
        show_teachers_menu =     "╔═══════════════════╗\n" +
        "║    Teachers       ║\n" +
        "╚═══════════════════╝\n" +
        "╔═══════════════════╗";
        show_teachers_menu_name = "║ Name: ";
        show_teachers_menu_payroll = "║ Payroll: ";
        show_teachers_menu_salary = "║ Salary: ";
        show_teachers_menu_subject = "║ Subject: ";
        show_teachers_menu_bottom = "╚═══════════════════╝";
       //mostrar alumnos
        show_students= "Enrolled students";
        show_students_menu =     "╔═══════════════════╗\n" +
        "║    Students       ║\n" +
        "╚═══════════════════╝\n" +
        "╔═══════════════════╗";
        show_students_menu_name = "║ Name: ";
        show_students_menu_id = "║ ID: ";
        show_students_menu_age = "║ Age: ";
        show_students_menu_enrollment = "║ Enrollment: ";
        show_students_menu_bottom = "╚═══════════════════╝";

       //mostrar cursos
        show_courses = "Current courses";
        show_courses_menu =     "╔═══════════════════╗\n" +
        "║    Courses        ║\n" +
        "╚═══════════════════╝\n" +
        "╔═══════════════════╗";
        show_courses_menu_name = "║ Name: ";
        show_courses_menu_topics = "║ Topics: ";
        show_courses_menu_credits = "║ Credits: ";
        show_courses_menu_hours = "║ Hours: ";
        show_courses_menu_bottom = "╚═══════════════════╝";
    }


}
