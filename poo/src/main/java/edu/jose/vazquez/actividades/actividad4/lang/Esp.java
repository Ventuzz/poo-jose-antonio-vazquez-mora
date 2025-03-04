package edu.jose.vazquez.actividades.actividad4.lang;

public class Esp extends Lang{
   /**
    * Constructor de la clase Esp que inicializa los mensajes en español para la aplicación
    */
    public Esp(){
      SELECT_AN_OPTION = "Selecciona una opción: ";
      INVALID_INPUT_EMPTY = "Entrada inválida. No puedes dejar el campo vacío.";
      INVALID_OPTION = "Opción inválida. Por favor, introduce un número del menú.";
      INVALID_INPUT_NOT_NUMBER = "Entrada inválida. Por favor, introduce un número.";
      INVALID_INPUT_NEGATIVE_NUMBER = "Entrada inválida. Por favor, introduce un número positivo.";
      GOODBYE =
        "╔═══════════════╗\n" +
        "║ ¡Hasta luego! ║\n" +
        "╚═══════════════╝\n";
      LANGUAGE_MENU_TOP = "\n╔══════════════════════════════════════════════╗\n║ El idioma actual de tu ordenador es: ";
      LANGUAGE_MENU_BOTTOM = "   ║\n║      ¿Te gustaría cambiar el idioma?         ║\n╠══════════════════════════════════════════════╣\n║                  1. Español                  ║\n║                  2. Ingles                   ║\n║                  3. Salir                    ║\n╚══════════════════════════════════════════════╝";
      SHOW_MENU = 
      "+------------------------------------------------------+\n" +
     "|            Menú Principal                           |\n" +
     "+------------------------------------------------------+\n" +
     "| 1. Dar de alta a un alumno                          |\n" +
     "| 2. Dar de alta a un profesor                        |\n" +
     "| 3. Crear un curso vacio                             |\n" +
     "| 4. Crear materias para un curso                     |\n" +
     "| 5. Asignar un estudiante a un curso                 |\n" +
     "| 6. Asignar materias a un curso vacio                |\n" +
     "| 7. Mostrar estudiantes inscritos a un curso         |\n" +
     "| 8. Mostrar Profesores de un curso                   |\n" +
     "| 9. Registros de cursos creados                      |\n" +
     "| 10. Registros de estudiantes inscritos              |\n" +
     "| 11. Registros de profesores contratados             |\n" +
     "| 12. Registros de materias impartidas                |\n" +
     "| 13. Calcular salario de un profesor                 |\n" +
     "| 14. Calcular horas y creditos de un curso           |\n" +
     "| 15. Salir                                           |\n" +
     "+------------------------------------------------------+";
      STUDENT_NAME = "Nombre del alumno: ";
      STUDENT_NAME_HEADLINER =
      "╔══════════════════════════════════╗\n" +
      "║   Ingresa el nombre del alumno   ║\n" +
      "╚══════════════════════════════════╝";
      STUDENT_ID = "Matrícula del alumno: ";
      STUDENT_ID_HEADLINER =
      "╔══════════════════════════════════╗\n" +
      "║  Ingresa la matrícula del alumno ║\n" +
      "╚══════════════════════════════════╝";
      STUDENT_AGE = "Edad del alumno: ";
      STUDENT_AGE_HEADLINER =
      "╔═════════════════════════════╗\n" +
      "║  Ingresa la edad del alumno ║\n" +
      "╚═════════════════════════════╝";
      STUDENT_ENROLLMENT = "Inscripción del alumno: ";
      STUDENT_ENROLLMENT_HEADLINER =
      "╔══════════════════════════════════════════════════════╗\n" +
      "║  Ingresa el curso al que quieres inscribir al alumno ║\n" +
      "╚══════════════════════════════════════════════════════╝";
      STUDENT_ADDED =
      "╔══════════════════════════════════════════╗\n" +
      "║ Estudiante añadido al sistema con éxito. ║\n" +
      "╚══════════════════════════════════════════╝";
      // Profesores
      TEACHER_NAME = "Nombre del profesor: ";
      TEACHER_NAME_HEADLINER =
      "╔══════════════════════════════════╗\n" +
      "║  Ingresa el nombre del profesor  ║\n" +
      "╚══════════════════════════════════╝";
      TEACHER_PAYROLL = "Nómina del profesor: ";
      TEACHER_PAYROLL_HEADLINER =
      "╔══════════════════════════════════╗\n" +
      "║  Ingresa la nómina del profesor  ║\n" +
      "╚══════════════════════════════════╝";
      
      TEACHER_ADDED =
      "╔════════════════════════════════════════╗\n" +
      "║ Profesor añadido al sistema con éxito. ║\n" +
      "╚════════════════════════════════════════╝";
      // Cursos
      COURSE_NAME_HEADLINER =
      "╔══════════════════════════════════════════════════════╗\n" +
      "║   Ingresa el nombre que quieres que tenga el curso   ║\n" +
      "╚══════════════════════════════════════════════════════╝";
      COURSE_NAME = "Nombre del curso: ";
      COURSE_TOPIC_NAME_HEADLINER =
      "╔══════════════════════════════════════════════════════╗\n" +
      "║ Ingresa el nombre de la materia que compone el curso ║\n" +
      "╚══════════════════════════════════════════════════════╝";
      COURSE_TOPIC_NAME = "Nombre de la materia: ";
      COURSE_TOPIC_ID_HEADLINER =
      "╔══════════════════════════════════════════════════════╗\n" +
      "║   Ingresa el ID de la materia que compone el curso   ║\n" +
      "╚══════════════════════════════════════════════════════╝";
      COURSE_TOPIC_ID = "ID de la materia: ";
      COURSE_TOPIC_CREDITS_HEADLINER =
      "╔══════════════════════════════════════════════════════╗\n" +
      "║      Ingresa los créditos que tiene la materia       ║\n" +
      "╚══════════════════════════════════════════════════════╝";
      COURSE_TOPIC_CREDITS = "Créditos de la materia: ";
      COURSE_TOPIC_HOURS_HEADLINER =
      "╔═══════════════════════════════════════════════════════╗\n" +
      "║ Ingresa las horas totales que se impartirá la materia ║\n" +
      "╚═══════════════════════════════════════════════════════╝";
      COURSE_TOPIC_HOURS = "Horas de la materia: ";
      COURSE_ADDED =
      "╔═════════════════════════════════════╗\n" +
      "║ Curso añadido al sistema con éxito. ║\n" +
      "╚═════════════════════════════════════╝";
      // Mostrar profesores
      SHOW_TEACHERS = "Profesores contratados";
      SHOW_TEACHERS_MENU =
      "╔═══════════════════╗\n" +
      "║    Profesores     ║\n" +
      "╚═══════════════════╝\n" +
      "╔═══════════════════╗";
      SHOW_TEACHERS_MENU_NAME = "║ Nombre: ";
      SHOW_TEACHERS_MENU_PAYROLL = "║ Nómina: ";
      SHOW_TEACHERS_MENU_BOTTOM = "╚═══════════════════╝";
      // Mostrar alumnos
      SHOW_STUDENTS_MENU =
      "╔═══════════════════╗\n" +
      "║      Alumnos      ║\n" +
      "╚═══════════════════╝\n" +
      "╔═══════════════════╗";
      SHOW_STUDENTS_MENU_NAME = "║ Nombre: ";
      SHOW_STUDENTS_MENU_ID = "║ Matrícula: ";
      SHOW_STUDENTS_MENU_AGE = "║ Edad: ";
      SHOW_STUDENTS_MENU_BOTTOM = "╚═══════════════════╝";
      // Mostrar cursos
      SHOW_COURSES = "Cursos actuales";
      SHOW_COURSES_MENU =
      "╔═══════════════════╗\n" +
      "║      Cursos       ║\n" +
      "╚═══════════════════╝\n" +
      "╔═══════════════════╗";
      SHOW_COURSES_MENU_NAME = "║ Nombre: ";
      SHOW_COURSES_MENU_TOPICS = "║ Materias: ";
      SHOW_COURSES_MENU_CREDITS = "║ Créditos: ";
      SHOW_COURSES_MENU_HOURS = "║ Horas: ";
      SHOW_COURSES_MENU_BOTTOM = "╚═══════════════════╝";
      SUBJECT_ADDED= 
      "╔════════════════════════════════════════╗\n" +
        "║  Materia añadida al sistema con éxito. ║\n" +
        "╚════════════════════════════════════════╝";
      //Mostrar materias
      SHOW_SUBJECTS_HEADLINER =
      "╔═══════════════════╗\n" +
      "║      Materias     ║\n" +
      "╚═══════════════════╝\n" +
      "╔═══════════════════╗";
      SHOW_SUBJECTS_NAME = "║ Nombre: ";
      SHOW_SUBJECTS_ID = "║ ID: ";
      SHOW_SUBJECTS_CREDITS = "║ Créditos: ";
      SHOW_SUBJECTS_HOURS = "║ Horas: ";
      SHOW_SUBJECTS_BOTTOM = "╚═══════════════════╝";

      // Errores
      NO_ENROLLED_STUDENTS = "No hay estudiantes inscritos.";
      NO_REGISTERED_COURSES = "No hay cursos registrados.";
      NOT_REGISTERED_TEACHERS = "No hay profesores registrados.";
      NOT_REGISTERED_TOPICS = "No hay temas registrados.";
      NO_TEACHER_FOUND = "Profesor no encontrado.";
      NOT_ASIGNATED_SUBJECTS = "No tiene materias asignadas.";
      TEACHER_WITH_COLON = "Profesor: ";

      INVALID_SELECTION = 
        "╔════════════════════╗\n" +
        "║ Selección inválida ║\n" +
        "╚════════════════════╝\n";
        STUDENT_TO_ENROLL =
        "╔════════════════════════════════════════════════════╗\n" +
        "║  Selecciona el estudiante al que quieres inscribir ║\n" +
        "╚════════════════════════════════════════════════════╝\n";
        NO_STUDENTS_ENROLLED =
        "╔═══════════════════════════════════════════════════════════════╗\n" +
        "║ No hay estudiantes registrados. Registre estudiantes primero. ║\n" +
        "╚═══════════════════════════════════════════════════════════════╝\n";

        NO_AVAILABLE_STUDENTS =
        "╔═══════════════════════════════════════════════════╗\n" +
        "║ No hay más estudiantes disponibles para inscribir ║\n" +
        "╚═══════════════════════════════════════════════════╝\n";

        AVAILABLE_STUDENTS =
        "╔═══════════════════════════╗\n" +
        "║  Estudiantes disponibles  ║\n" +
        "╚═══════════════════════════╝\n";

        SELECT_STUDENT = "Seleccione un estudiante (ingrese el número):";
        CANCELING =
        "╔═══════════════╗\n" +
        "║ Cancelando... ║\n" +
        "╚═══════════════╝\n";

        NO_AVAILABLE_COURSES =
        "╔═══════════════════════════╗\n" +
        "║ No hay cursos disponibles ║\n" +
        "╚═══════════════════════════╝\n";

        NO_AVAILABLE_COURSES_TO_ENROLL =
        "╔═══════════════════════════════════════════════════╗\n" +
        "║    No hay más cursos disponibles para inscribir   ║\n" +
        "╚═══════════════════════════════════════════════════╝\n"; //cuadro
        AVAILABLE_COURSES =
        "╔══════════════════════╗\n" +
        "║  Cursos disponibles  ║\n" +
        "╚══════════════════════╝\n"; //cuadro
        SUBJECT_TO_ENROLL =
        "╔═══════════════════════════════════════════╗\n" +
        "║ Selecciona la materia que quieres asignar ║\n" +
        "╚═══════════════════════════════════════════╝\n";//cuadro
        NO_SUBJECT_ENROLLED =
        "╔═════════════════════════════════════════════════════════╗\n" +
        "║ No hay materias registradas. Registre materias primero. ║\n" +
        "╚═════════════════════════════════════════════════════════╝\n";
//cuadro
        NO_AVAILABLE_SUBJECTS =
        "╔══════════════════════════════════════════════╗\n" +
        "║ No hay más materias disponibles para asignar ║\n" +
        "╚══════════════════════════════════════════════╝\n"; //cuadro
        AVAILABLE_SUBJECTS =
        "╔════════════════════════╗\n" +
        "║  Materias disponibles  ║\n" +
        "╚════════════════════════╝\n"; //cuadro
        SELECT_COURSE = "Seleccione un curso:";
        SELECT_SUBJECT = "Seleccione una materia (ingrese el número):";
        NO_AVAILABLE_COURSE =
        "╔═══════════════════════════╗\n" +
        "║ No hay cursos disponibles ║\n" +
        "╚═══════════════════════════╝\n";
//cuadro
        NO_AVAILABLE_COURSE_TO_ASSING =
        "╔══════════════════════════════════════════════════════╗\n" +
        "║ No hay más cursos disponibles para asignar materias. ║\n" +
        "╚══════════════════════════════════════════════════════╝\n";
//cuadro

        NO_REGISTERED_COURSES =
        "╔═════════════════════════════════════════════════════╗\n" +
        "║ No hay cursos registrados. Registre cursos primero. ║\n" +
        "╚═════════════════════════════════════════════════════╝\n";
//cuadro
        TEACHER_TO_CALCULATE_SALARY =
        "╔════════════════════════════════════════════════════════════╗\n" +
        "║ Selecciona el profesor al que quieres calcular el salario. ║\n" +
        "╚════════════════════════════════════════════════════════════╝\n";
        //cuadro
        NOT_REGISTERED_TEACHERS =
        "╔═════════════════════════════════════════════════════════════╗\n" +
        "║ No hay profesores registrados. Registre profesores primero. ║\n" +
        "╚═════════════════════════════════════════════════════════════╝\n";
        //cuadro
        AVAILABLE_TEACHERS =
        "╔══════════════════════════╗\n" +
        "║  Profesores disponibles  ║\n" +
        "╚══════════════════════════╝\n";

        SELECT_TEACHER = "Seleccione un profesor (ingrese el número):";
        COURSE_TO_CALCULATE_HOUR =
        "╔═══════════════════════════════════════════════════════════════╗\n" +
        "║ Selecciona el curso al que quieres calcular horas y créditos. ║\n" +
        "╚═══════════════════════════════════════════════════════════════╝\n";


              
  }


}
