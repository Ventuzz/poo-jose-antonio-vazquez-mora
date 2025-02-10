package edu.jose.vazquez.actividades.actividad4.lang;

public class Esp extends Lang{

    public Esp(){
        select_an_option = "Selecciona una opción: ";
        invalid_input_empty = "Entrada inválida. No puedes dejar el campo vacío.";
        invalid_option = "Opción inválida. Por favor, introduce un número del menú.";
        invalid_input_not_number = "Entrada inválida. Por favor, introduce un número.";
        invalid_input_negative_number = "Entrada inválida. Por favor, introduce un número positivo.";
        goodbye = "¡Hasta luego!";
        language_menu_top = "\n╔══════════════════════════════════════════════╗\n║ El idioma actual de tu ordenador es: ";
        language_menu_bottom = "   ║\n║      ¿Te gustaría cambiar el idioma?         ║\n╠══════════════════════════════════════════════╣\n║                  1. Español                  ║\n║                  2. Ingles                   ║\n║                  3. Salir                    ║\n╚══════════════════════════════════════════════╝";
        showMenu =         "+------------------------------------------+\n" +
        "|            Menú Principal               |\n" +
        "+------------------------------------------+\n" +
        "| 1. Dar de alta a un alumno              |\n" +
        "| 2. Dar de alta a un profesor            |\n" +
        "| 3. Crear un curso                      |\n" +
        "| 4. Mostrar profesores contratados       |\n" +
        "| 5. Mostrar alumnos inscritos            |\n" +
        "| 6. Mostrar cursos actuales             |\n" +
        "| 7. Salir                               |\n" +
        "+------------------------------------------+";
         student_name= "Nombre del alumno: ";
         student_name_headliner=
         "╔══════════════════════════════════╗\n" +
         "║   Ingresa el nombre del alumno   ║\n" +
         "╚══════════════════════════════════╝";
         student_id= "Matrícula del alumno: ";
            student_id_headliner=
            "╔══════════════════════════════════╗\n" +
            "║  Ingresa la matrícula del alumno ║\n" +
            "╚══════════════════════════════════╝";
         student_age= "Edad del alumno: ";
            student_age_headliner=
            "╔═════════════════════════════╗\n" +
            "║  Ingresa la edad del alumno ║\n" +
            "╚═════════════════════════════╝";
         student_enrollment= "Inscripción del alumno: ";
            student_enrollment_headliner=
            "╔══════════════════════════════════════════════════════╗\n" +
            "║  Ingresa el curso al que quieres inscribir al alumno ║\n" +
            "╚══════════════════════════════════════════════════════╝";
         student_added= 
         "╔══════════════════════════════════════════╗\n" +
         "║ Estudiante añadido al sistema con exito. ║\n" +
         "╚══════════════════════════════════════════╝"; 
        //profesores
         teacher_name= "Nombre del profesor: ";
            teacher_name_headliner=
            "╔══════════════════════════════════╗\n" +
            "║  Ingresa el nombre del profesor  ║\n" +
            "╚══════════════════════════════════╝";
         teacher_payroll= "Nómina del profesor: ";
            teacher_payroll_headliner=
            "╔══════════════════════════════════╗\n" +
            "║  Ingresa la nómina del profesor  ║\n" +
            "╚══════════════════════════════════╝";
         teacher_salary= "Salario del profesor: ";
            teacher_salary_headliner=
            "╔══════════════════════════════════╗\n" +
            "║ Ingresa el salario del profesor  ║\n" +
            "╚══════════════════════════════════╝";
         teacher_subject= "Materia del profesor: ";
            teacher_subject_headliner=
            "╔════════════════════════════════════════════════════╗\n" +
            "║  Ingresa la materia que va a impartir el profesor  ║\n" +
            "╚════════════════════════════════════════════════════╝";
         teacher_added= 
         "╔════════════════════════════════════════╗\n" +
         "║ Profesor añadido al sistema con exito. ║\n" +
         "╚════════════════════════════════════════╝"; 
        //cursos
         course_name_headliner=
         "╔══════════════════════════════════════════════════════╗\n" +
         "║   Ingresa el nombre que quieres que tenga el curso   ║\n" +
         "╚══════════════════════════════════════════════════════╝";
         course_name= "Nombre del curso: ";
         course_topic_name_headliner=
         "╔══════════════════════════════════════════════════════╗\n" +
         "║ Ingresa el nombre de la materia que compone el curso ║\n" +
         "╚══════════════════════════════════════════════════════╝";
         course_topic_name= "Nombre de la materia: ";
         course_topic_id_headliner=
         "╔══════════════════════════════════════════════════════╗\n" +
         "║   Ingresa el ID de la materia que compone el curso   ║\n" +
         "╚══════════════════════════════════════════════════════╝";
        course_topic_id= "ID de la materia: ";
        course_topic_credits_headliner=
        "╔══════════════════════════════════════════════════════╗\n" +
        "║      Ingresa los créditos que tiene la materia       ║\n" +
        "╚══════════════════════════════════════════════════════╝";
        course_topic_credits= "Créditos de la materia: ";
        course_topic_hours_headliner=
        "╔═══════════════════════════════════════════════════════╗\n" +
        "║ Ingresa las horas totales que se impartirá la materia ║\n" +
        "╚═══════════════════════════════════════════════════════╝"; 
        course_topic_hours= "Horas de la materia: ";

         course_added=
         "╔═════════════════════════════════════╗\n" +
         "║ Curso añadido al sistema con exito. ║\n" +
         "╚═════════════════════════════════════╝"; 
        //mostrar profesores
         show_teachers = "Profesores contratados";
         show_teachers_menu =     "╔═══════════════════╗\n" +
         "║    Profesores     ║\n" +
         "╚═══════════════════╝\n" +
         "╔═══════════════════╗";
         show_teachers_menu_name = "║ Nombre: ";
            show_teachers_menu_payroll = "║ Nómina: ";
            show_teachers_menu_salary = "║ Salario: ";
            show_teachers_menu_subject = "║ Materia: ";
            show_teachers_menu_bottom = "╚═══════════════════╝";
        //mostrar alumnos
         show_students= "Alumnos inscritos";
         show_students_menu =
            "╔═══════════════════╗\n" +
            "║      Alumnos      ║\n" +
            "╚═══════════════════╝\n" +
            "╔═══════════════════╗";
            show_students_menu_name = "║ Nombre: ";
            show_students_menu_id = "║ Matrícula: ";
            show_students_menu_age = "║ Edad: ";
            show_students_menu_enrollment = "║ Inscrito al curso de: ";
            show_students_menu_bottom = "╚═══════════════════╝";
        //mostrar cursos
         show_courses = "Cursos actuales";
            show_courses_menu =     "╔═══════════════════╗\n" +
                "║      Cursos       ║\n" +
                "╚═══════════════════╝\n" +
                "╔═══════════════════╗";
                show_courses_menu_name = "║ Nombre: ";
                show_courses_menu_topics = "║ Materias: ";
                show_courses_menu_credits = "║ Créditos: ";
                show_courses_menu_hours = "║ Horas: ";
                show_courses_menu_bottom = "╚═══════════════════╝";
    }


}
