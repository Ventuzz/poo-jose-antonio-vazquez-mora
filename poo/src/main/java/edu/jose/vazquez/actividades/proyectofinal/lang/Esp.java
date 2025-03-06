package edu.jose.vazquez.actividades.proyectofinal.lang;
/**
 * Clase que se encarga de gestionar los mensajes en español
 */
public class Esp extends Lang{

    public Esp(){

        menu_login = 
                "\n╔═══════════════════════════╗\n" +
                  "║      Iniciar sesión       ║\n" +
                  "╠═══════════════════════════╣\n" +
                  "║ No tengo una cuenta       ║\n" +
                  "║ 1. Registrarse            ║\n" +
                  "║                           ║\n" +
                  "║ Ya tengo una cuenta       ║\n" +
                  "║ 2. Iniciar sesión         ║\n" +
                  "║                           ║\n" +
                  "║ 3. Salir                  ║\n" +
                  "╚═══════════════════════════╝";

        menu_admin = 
              "\n╔═══════════════════════════════════════════════════════════╗\n" +
                "║                 MENÚ DE ADMINISTRADOR                     ║\n" +
                "╠═══════════════════════════════════════════════════════════╣\n" +
                "║     1. Agregar nuevos libros a la biblioteca              ║\n" +
                "║     2. Verificación estado de los prestamos               ║\n" +
                "║     3. Ver préstamos activos                              ║\n" +
                "║     4. Gestionar registros                                ║\n" +
                "║     5. Salir                                              ║\n" +
                "╚═══════════════════════════════════════════════════════════╝";

        menu_admin_advance = 
              "\n╔═══════════════════════════════════════════════════════════╗\n" +
                "║                         Registros                         ║\n" +
                "╠═══════════════════════════════════════════════════════════╣\n" +
                "║     1. Consultar personas registradas en la biblioteca    ║\n" +
                "║     2. Mostrar libros en stock                            ║\n" +
                "║     3. Ver todos los préstamos del mes                    ║\n" +
                "║     4. TOP libros más solicitados                         ║\n" +
                "║     5. TOP libros menos solicitados                       ║\n" +
                "║     6. Mostrar prestamos vencidos                         ║\n" +
                "║     7. Mostrar usuarios con prestamos vencidos            ║\n" +
                "║     8. Mostrar lista negra                                ║\n" +
                "║     9. Mostrar lista de honor                             ║\n" +
                "║     10. Salir                                             ║\n" +
                "╚═══════════════════════════════════════════════════════════╝";

        menu_user = 
              "\n╔══════════════════════════════════════════════╗\n" +
                "║                    MENÚ                      ║\n" +
                "╠══════════════════════════════════════════════╣\n" +
                "║     1. Ver libros disponibles                ║\n" +
                "║     2. Solicitar préstamo de un libro        ║\n" +
                "║     3. Préstamos activos                     ║\n" +
                "║     4. Devolver un libro                     ║\n" +
                "║     5. Salir                                 ║\n" +
                "╚══════════════════════════════════════════════╝";

        invalid_option = 
              "\n╔════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  Opción no válida, no puedes ingresar números que no están en el menú      ║\n" +
                "╚════════════════════════════════════════════════════════════════════════════╝";

        username_prompt = 
              "\n╔══════════════════════════════════════════╗\n" +
                "║ Excelente, ingresa tu nombre de usuario  ║\n" +
                "╚══════════════════════════════════════════╝\n";

        password_prompt = 
              "\n╔═══════════════════════════════╗\n" +
                "║   Ahora ingresa tu contraseña ║\n" +
                "╚═══════════════════════════════╝\n";

        welcome_admin = 
              "\n╔═══════════════════════════╗\n" +
                "║  Bienvenido Administrador ║\n" +
                "╚═══════════════════════════╝";

        welcome_user = 
              "\n╔═════════════════════════════╗\n" +
                "  Bienvenido de vuelta, ";

        welcome_user_format = 
                "\n" +
                "╚═════════════════════════════╝";

        goodbye = 
              "\n╔════════════╗\n" +
                "║  ¡Adiós!   ║\n" +
                "╚════════════╝";

        register_user = 
              "\n╔════════════════════════════════════════════════════╗\n" +
                "║   Ingresa un nombre de usuario para registrarte    ║\n" +
                "╚════════════════════════════════════════════════════╝";

        register_password = 
              "\n╔═════════════════════════════════════════╗\n" +
                "║     Ingresa una contraseña segura       ║\n" +
                "╚═════════════════════════════════════════╝";

        registration_success = 
              "\n╔═════════════════════════════╗\n" +
                "║  ¡Cuenta creada con éxito!  ║\n" +
                "╚═════════════════════════════╝";

        invalid_credentials = 
              "\n╔═══════════════════════════╗\n" +
                "║    Credenciales inválidas ║\n" +
                "╚═══════════════════════════╝";

        book_added = 
              "\n╔════════════════════════════════════════════╗\n" +
                "║  ¡Libro agregado exitosamente al catálogo! ║\n" +
                "╚════════════════════════════════════════════╝";

        book_borrow_success="\nLibro prestado con éxito";
        book_not_available="\nEl libro no está disponible";
        invalid_input_empty = 
                "\n╔═════════════════════════════════════════════════════╗\n" +
                "║  Opción no válida, no puedes dejar el campo vacío   ║\n" +
                "╚═════════════════════════════════════════════════════╝";

        invalid_input_not_number = 
                "\n╔═══════════════════════════════════════════════════════════╗\n" +
                "║       Opción no válida, por favor ingresa un número       ║\n" +
                "╚═══════════════════════════════════════════════════════════╝";

        invalid_option_out_of_range = 
                "\n╔════════════════════════════════════════════════════════════════════╗n" +
                "║    Opción no válida, solo puedes ingresar carácteres numéricos       ║\n" +
                "╚══════════════════════════════════════════════════════════════════════╝";

        enter_book_title_prompt = 
                "\n╔══════════════════════════════╗\n" +
                "║ Ingresa el título del libro  ║\n" +
                "╚══════════════════════════════╝\n";

        exit_admin_advance = 
              "\n╔═════════════════════════════╗\n" +
                "║  Saliendo de los registros  ║\n" +
                "╚═════════════════════════════╝";
        invalid_title = 
                "\n╔═════════════════════════════════════════════════════════╗\n" +
                "║  El libro debe tener un nombre, inténtalo de nuevo      ║\n" +
                "╚═════════════════════════════════════════════════════════╝";

        enter_book_author_prompt = 
                "\n╔═══════════════════════════════╗\n" +
                "║  Ingresa el autor del libro   ║\n" +
                "╚═══════════════════════════════╝\n";

        invalid_author = 
                "\n╔════════════════════════════════════════════════════════╗\n" +
                "║    El libro debe tener un autor, inténtalo de nuevo.   ║\n" +
                "╚════════════════════════════════════════════════════════╝";

        enter_book_isbn_prompt = 
                "\n╔═════════════════════════════╗\n" +
                "║ Ingresa el ISBN del libro   ║\n" +
                "╚═════════════════════════════╝\n";

        invalid_isbn = 
                "\n╔══════════════════════════════════════════════════════════════╗\n" +
                "║   El libro debe tener un código ISBN, inténtalo de nuevo.    ║\n" +
                "╚══════════════════════════════════════════════════════════════╝";

        enter_book_genre_prompt = 
                "\n╔══════════════════════════════╗\n" +
                "║ Ingresa el género del libro  ║\n" +
                "╚══════════════════════════════╝\n";

        invalid_genre = 
                "\n╔══════════════════════════════════════════════════════════════════════════╗\n" +
                "║    El libro debe pertenecer a un género literario, inténtalo de nuevo.   ║\n" +
                "╚══════════════════════════════════════════════════════════════════════════╝";

        enter_book_year_prompt = 
              "\n╔══════════════════════════════════════════╗\n" +
                "║ Ingresa el año de publicación del libro  ║\n" +
                "╚══════════════════════════════════════════╝\n";

        year_of_publication_negative_error = 
                "\n╔══════════════════════════════════════════════════════════════╗\n" +
                "║        El año de publicación no puede ser negativo.          ║\n" +
                "╚══════════════════════════════════════════════════════════════╝";

        year_of_publication_future_error = 
              "\n╔════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  El año de publicación aún no ha llegado. Ingresa un año válido (hasta 2025).  ║\n" +
                "╚════════════════════════════════════════════════════════════════════════════════╝";

        book_entry_success = 
                "\n╔════════════════════════════════════════╗\n" +
                "║ El libro se registrará como disponible ║\n" +
                "╚════════════════════════════════════════╝";

        book_borrow_name_prompt = 
                "\n╔═════════════════════════════════════════════════════════╗\n" +
                "║   Ingresa el ISBN del libro que deseas pedir prestado   ║\n" +
                "╚═════════════════════════════════════════════════════════╝";

        no_active_loans_message = 
              "\n╔════════════════════════════════════════════════════╗\n" +
                "║    Estos son los libros que has pedido prestados   ║\n" +
                "╚════════════════════════════════════════════════════╝";

        no_books_borrowed_message = "\nNo tienes préstamos activos";

        show_books_in_catalog_message = 
                "\n╔════════════════════════════════════════════╗\n" +
                "║  Este es nuestro catálogo actual de libros ║\n" +
                "╚════════════════════════════════════════════╝";

        number_format_exception = 
                "\n╔══════════════════════════════════════════════════════════════╗\n" +
                "║        Solo puedes ingresar números, intenta de nuevo.       ║\n" +
                "╚══════════════════════════════════════════════════════════════╝";

        exit_admin = 
              "\n╔══════════════════════════════════════╗\n" +
                "║  Saliendo del menú de administrador  ║\n" +
                "╚══════════════════════════════════════╝";

        singning_out = 
              "\n╔═══════════════════════════════╗\n" +
                "║  Cerrando sesión de tu cuenta ║\n" +
                "╚═══════════════════════════════╝";

        return_to_menu = "\nPresiona ENTER para volver al menú...";

        invalid_new_username = 
              "\n╔══════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  Ingresa un nombre de usuario válido, no puede estar vacío, inténtalo de nuevo   ║\n" +
                "╚══════════════════════════════════════════════════════════════════════════════════╝";

        invalid_new_password = 
                "\n╔═════════════════════════════════════════════════════════════════╗\n" +
                "║     La contraseña no puede dejarse en blanco, intenta de nuevo  ║\n" +
                "╚═════════════════════════════════════════════════════════════════╝";

        registered_people = 
                "\n╔══════════════════════════════════════════════╗\n" +
                "║ Las personas registradas en el sistema son:  ║\n" +
                "╚══════════════════════════════════════════════╝";

        show_active_loans ="\nMostrando préstamos activos...";
        select_an_option = "\nSelecciona una opción: ";
        author="Autor: ";
        title ="Título: ";
        isbn="ISBN: ";
        genre="Género: ";
        year_book="Año de publicación: ";
        username="Nombre de usuario: ";
        password="Contraseña: ";

        //CLI
        menu_lower ="\n╔═════════════════════════════╗\n";
        menu_upper ="╚═════════════════════════════╝";

        enter_age =
                "╔═══════════════════╗\n" +
                "║  Ingrese su edad  ║\n" +
                "╚═══════════════════╝\n";

        age ="Edad: ";

        age_negative =
                "╔════════════════════════════════╗\n" +
                "║  La edad no puede ser negativa ║\n" +
                "╚════════════════════════════════╝\n";

        error_valid_number =
                "╔════════════════════════════╗\n" +
                "║  Ingrese un número válido  ║\n" +
                "╚════════════════════════════╝\n";

        error_real_name =
                "╔═══════════════════════════╗\n" +
                "║  Ingrese su nombre real   ║\n" +
                "╚═══════════════════════════╝\n";

        name_with_colon ="Nombre: ";

        error_valid_name =
                "╔════════════════════════════╗\n" +
                "║  Ingrese un nombre válido  ║\n" +
                "╚════════════════════════════╝\n";



        user_showuser = "║  Usuario:  ";

        name_showuser = "║ Nombre:";

        user_type_showuser ="║ Tipo de usuario: ";

        password_showuser = "║ Contraseña: ";

        edad_showuser = "║ Edad: ";

        jr_menu =
            "╔═══════════════════════════════╗\n" +
            "║             Menú JR           ║\n" +
            "╠═══════════════════════════════╣\n"+
            "║ 1. Ver libros disponibles     ║\n"+
            "║ 2. Salir                      ║\n"+
            "╚═══════════════════════════════╝\n";

        vip_menu =
        "╔═══════════════════════════════════════╗\n"+
        "║               Menú VIP                ║\n"+
        "╠═══════════════════════════════════════╣\n"+
        "║ 1. Ver libros disponibles             ║\n"+
        "║ 2. Solicitar préstamo de un libro     ║\n"+
        "║ 3. Préstamos activos                  ║\n"+
        "║ 4. Devolver un libro                  ║\n"+
        "║ 5. Salir                              ║\n"+
        "╚═══════════════════════════════════════╝\n";

        teens_menu =
        "╔═══════════════════════════════════════╗\n"+
        "║               Menú Teens              ║\n"+
        "╠═══════════════════════════════════════╣\n"+
        "║ 1. Ver libros disponibles             ║\n"+
        "║ 2. Solicitar préstamo de un libro     ║\n"+
        "║ 3. Préstamos activos                  ║\n"+
        "║ 4. Devolver un libro                  ║\n"+
        "║ 5. Salir                              ║\n"+
        "╚═══════════════════════════════════════╝\n";


        error_same_unique_code =
                "╔═════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  El libro no se puede agregar, ya existe un libro con el mismo código único ║\n" +
                "╚═════════════════════════════════════════════════════════════════════════════╝\n";

        update_loans =
                "╔═══════════════════════════════════╗\n" +
                "║  Se han actualizado los préstamos ║\n" +
                "╚═══════════════════════════════════╝\n";

        borrowed_success =
                "╔════════════════════════════════╗\n" +
                "║  Préstamo realizado con éxito  ║\n" +
                "╚════════════════════════════════╝\n";
            

        adult_borrowed =
                "╔═════════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  El libro se ha prestado por 7 días por ser un usuario adulto recuerda devolverlo a tiempo  ║\n" +
                "╚═════════════════════════════════════════════════════════════════════════════════════════════╝\n";

        enter_isbn =
                "╔═══════════════════════════════════════════════╗\n" +
                "║  Ingrese el ISBN del libro que desea devolver ║\n" +
                "╚═══════════════════════════════════════════════╝\n";

        entered_invalid_isbn =
                "╔═══════════════════════════╗\n" +
                "║  Ingrese un ISBN válido   ║\n" +
                "╚═══════════════════════════╝\n";

        teen_borrowed =
                "╔══════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  El libro se ha prestado por 7 días por ser un usuario teen recuerda devolverlo a tiempo ║\n" +
                "╚══════════════════════════════════════════════════════════════════════════════════════════╝\n";

        vip_borrowed =
                "╔══════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  El libro se ha prestado por 14 días por ser un usuario VIP recuerda devolverlo a tiempo ║\n" +
                "╚══════════════════════════════════════════════════════════════════════════════════════════╝\n";

        //bibliotecario
        fantasy =
                "Fantasía";

        got =
                "Juego de tronos";

        lotr =
                "El señor de los anillos";

        hp =
                "Harry Potter";

        tlp =
                "El principito";

        ohyos =
                "Cien años de soledad";

        dqolm =
                "Don Quijote de la Mancha";
        ta ="El alquimista";

        tvdc="El código Da Vinci";

        tp ="El perfume";

        tsotw ="La sombra del viento";
        
        ttob ="La ladrona de libros";

        error_modifing_date =
                "Error al procesar la fecha de vencimiento: ";

        user_and_book_not_found =
                "╔═══════════════════════════════════════════════════════════════╗\n" +
                "║  No se encontró un préstamo activo para este libro y usuario. ║\n" +
                "╚═══════════════════════════════════════════════════════════════╝\n";
        overdue_loans =
                "Préstamos vencidos: ";

        book_alone = "Libro: ";
        isbn_overdue_loans = "║ ISBN: ";
        
        user_overdue_loans = "║ Usuario: ";
        
        return_date_overdue_loans = "║ Fecha de devolución: ";

        error_comparing_dates =
                "Error al comparar fechas:  ";

        no_overdue_loans =
                "╔═════════════════════════════════════════════╗\n" +
                "║  No hay préstamos vencidos en la biblioteca ║\n" +
                "╚═════════════════════════════════════════════╝\n";
        error_already_exists =
                "╔════════════════════════════════╗\n" +
                "║  Error: El usuario ya existe.  ║\n" +
                "╚════════════════════════════════╝\n";
        user_not_found =
                "╔════════════════════════════════╗\n" +
                "║  Error: Usuario no encontrado  ║\n" +
                "╚════════════════════════════════╝\n";
        book_not_found =
                "╔════════════════════════════════╗\n" +
                "║  Error: Libro no encontrado    ║\n" +
                "╚════════════════════════════════╝\n";
        book_not_available =
                "╔════════════════════════════════╗\n" +
                "║  Error: Libro no disponible    ║\n" +
                "╚════════════════════════════════╝\n";

        return_date =
                "╔═══════════════════════╗\n" +
                "║  Fecha de devolución: ║\n" +
                "╚═══════════════════════╝\n";

        no_overdue_loans =
                "╔═════════════════════════════════════════════╗\n" +
                "║  No hay préstamos vencidos en la biblioteca ║\n" +
                "╚═════════════════════════════════════════════╝\n";


        overload_teens =
                "╔══════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  Solo puedes tener 1 libro prestado a la vez, por favor devuelvelo antes de pedir otro.  ║\n" +
                "╚══════════════════════════════════════════════════════════════════════════════════════════╝\n";

        overload_adult =
                "╔═════════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  Solo puedes tener 2 libros prestados a la vez, por favor devuelve uno antes de pedir otro. ║\n" +
                "╚═════════════════════════════════════════════════════════════════════════════════════════════╝\n";

        overload_vip =
                "╔═════════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  Solo puedes tener 5 libros prestados a la vez, por favor devuelve uno antes de pedir otro. ║\n" +
                "╚═════════════════════════════════════════════════════════════════════════════════════════════╝\n";

        error_saving_loans =
                "Error al guardar préstamos: ";

        loans_data_not_found =
                "╔═════════════════════════════════════════╗\n" +
                "║  No se encontraron datos de prestamos.  ║\n" +
                "╚═════════════════════════════════════════╝\n";
        error_saving_user =
                "Error al guardar usuarios: ";
                
        user_data_not_found =
                "╔══════════════════════════════════════════╗\n" +
                "║  No se encontraron datos de usuarios.    ║\n" +
                "╚══════════════════════════════════════════╝\n";
        error_loading_user =
                "╔═════════════════════════════╗\n" +
                "║  Error al cargar usuarios.  ║\n" +
                "╚═════════════════════════════╝\n";
        error_saving_books =
                "Error al guardar libros: ";
        book_data_not_found =
                "╔══════════════════════════════════════╗\n" +
                "║  No se encontraron datos de libros.  ║\n" +
                "╚══════════════════════════════════════╝\n";
        error_loading_books =
                "╔═════════════════════════════╗\n" +
                "║  Error al cargar libros.    ║\n" +
                "╚═════════════════════════════╝\n";
        succesfuly_returned =
                "╔═════════════════════════════╗\n" +
                "║  Libro devuelto con éxito   ║\n" +
                "╚═════════════════════════════╝\n";
        book_not_borrowed =
                "╔══════════════════════════════════════════╗\n" +
                "║  Error: No tienes este libro prestado.   ║\n" +
                "╚══════════════════════════════════════════╝\n";
        users_with_overdue =
                "Usuarios con préstamos vencidos: ";

        no_users_with_overdue =
                "╔══════════════════════════════════════════╗\n" +
                "║  No hay usuarios con préstamos vencidos. ║\n" +
                "╚══════════════════════════════════════════╝\n";
        users_with_more_overdue =
                "Usuarios con más préstamos vencidos: ";
        user_more_returned = "Usuario: ";

        book_more_overdue = "║ Libro: ";

        name_more_returned = "║ Nombre: ";

        type_more_returned = "║ Tipo: ";

        overdue_loans_more_overdue = "║ Préstamos vencidos: ";

        users_with_more_returns =
                "Usuarios con más préstamos entregados: ";

        no_users_with_returns =
                "╔═════════════════════════════════════════════╗\n" +
                "║  No hay usuarios con préstamos entregados.  ║\n" +
                "╚═════════════════════════════════════════════╝\n";

        returned_loans = "║ Préstamos entregados: ";

        books_arranged_by_title =
                "Libros ordenados por título: ";

        currently_available =
                "Actualmente disponible";

        currently_borrowed =
                "Actualmente prestado";

        available_books_arranged_by_title =
                "Libros disponibles ordenados por título: ";

        no_books_available_on_library =
                "╔═══════════════════════════════════════════════╗\n" +
                "║  No hay libros disponibles en la biblioteca.  ║\n" +
                "╚═══════════════════════════════════════════════╝\n";
        popular_books =
                "Libros más populares: ";
        no_popular_books =
                "╔═══════════════════════════════════════════╗\n" +
                "║  No hay libros populares en la biblioteca ║\n" +
                "╚═══════════════════════════════════════════╝\n";
        title_more_popular = "Título: ";

        author_more_popular = "║ Autor: ";

        times_more_popular = "║ Veces que se ha prestado: ";

        unpopular_books =
                "Libros menos populares: ";
        no_books_on_library =
                "╔═══════════════════════════════════╗\n" +
                "║  No hay libros en la biblioteca.  ║\n" +
                "╚═══════════════════════════════════╝\n";
        loans_of_month =
                "Préstamos del mes: ";
        
        borrow_date_admin_loans = "║ Fecha de préstamo: ";

        no_loans_on_month =
                "╔════════════════════════════════════════════════════════════╗\n" +
                "║  No se han registrado prestamos en la biblioteca este mes. ║\n" +
                "╚════════════════════════════════════════════════════════════╝\n";
        active_loans =
                "Préstamos activos: ";
        no_active_loans =
                "╔═════════════════════════════════════════════╗\n" +
                "║  No hay préstamos activos en la biblioteca. ║\n" +
                "╚═════════════════════════════════════════════╝\n";
        active_loans_of =
                "Préstamos activos de  ";
        asset_loans =
                "╔══════════════════════════════════╗\n" +
                "║  No tienes préstamos activos.    ║\n" +
                "╚══════════════════════════════════╝\n";
        error_book_already_registered =
                "╔═══════════════════════════════════════════╗\n" +
                "║  Error: El libro ya está registrado.      ║\n" +
                "╚═══════════════════════════════════════════╝\n";

    }
}