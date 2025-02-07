package edu.jose.vazquez.actividades.avanceproyecto.lang;

public class Esp extends Lang{

    public Esp(){

        menu_login="\n╔═══════════════════════════╗\n║      Iniciar sesión       ║\n╠═══════════════════════════╣\n║ No tengo una cuenta       ║\n║ 1. Registrarse            ║\n║                           ║\n║ Ya tengo una cuenta       ║\n║ 2. Iniciar sesión         ║\n║                           ║\n║ 3. Salir                  ║\n╚═══════════════════════════╝";
        menu_admin="\n╔═══════════════════════════════════════════════════════════╗\n║                       MENÚ DE ADMINISTRADOR                          ║\n╠═══════════════════════════════════════════════════════════╣\n║     1. Consultar personas registradas en la biblioteca           ║\n║     2. Agregar nuevos libros a la biblioteca                       ║\n║     3. Mostrar libros en stock                                ║\n║     4. Ver préstamos activos                                 ║\n║     5. Salir                                               ║\n╚═══════════════════════════════════════════════════════════╝";
        menu_user="\n╔══════════════════════════════════════════════╗\n║                    MENÚ                      ║\n╠══════════════════════════════════════════════╣\n║     1. Ver libros disponibles                 ║\n║     2. Solicitar préstamo de un libro            ║\n║     3. Préstamos activos                          ║\n║     4. Salir                                  ║\n╚══════════════════════════════════════════════╝";
        invalid_option="\n╔════════════════════════════════════════════════════════════════════════════╗\n║  Opción no válida, no puedes ingresar números que no están en el menú         ║\n╚════════════════════════════════════════════════════════════════════════════╝";
        username_prompt="\n╔═════════════════════════════════╗\n║ Excelente, ingresa tu nombre de usuario: ║\n╚═════════════════════════════════╝\n";
        password_prompt="\n╔═══════════════════════════════╗\n║   Ahora ingresa tu contraseña     ║\n╚═══════════════════════════════╝\n";
        welcome_admin="\n╔═══════════════════════════╗\n║  Bienvenido Administrador    ║\n╚═══════════════════════════╝";
        welcome_user="\n╔═══════════════════════╗\n║  Bienvenido, ";
        welcome_user_format=" ║\n╚═══════════════════════╝";
        goodbye="\n╔════════════╗\n║  ¡Adiós!  ║\n╚════════════╝";
        register_user="\n╔═══════════════════════════════════╗\n║   Ingresa un nombre de usuario para registrarte    ║\n╚═══════════════════════════════════╝";
        register_password="\n╔═══════════════════════════════════╗\n║     Ingresa una contraseña segura       ║\n╚═══════════════════════════════════╝";
        registration_success="\n╔═════════════════════════════════╗\n║  ¡Cuenta creada con éxito!  ║\n╚═════════════════════════════════╝";
        invalid_credentials="\n╔═══════════════════════════╗\n║    Credenciales inválidas    ║\n╚═══════════════════════════╝";
        book_added="\n╔══════════════════════════════════════════╗\n║  ¡Libro agregado exitosamente al catálogo! ║\n╚══════════════════════════════════════════╝";
        book_borrow_success="\nLibro prestado con éxito";
        book_not_available="\nEl libro no está disponible";
        invalid_input_empty = "\n╔═════════════════════════════════════════════════════╗\n║  Opción no válida, no puedes dejar el campo vacío   ║\n╚═════════════════════════════════════════════════════╝";
        invalid_input_not_number = "\n╔═══════════════════════════════════════════════════════════╗\n║       Opción no válida, por favor ingresa un número         ║\n╚═══════════════════════════════════════════════════════════╝";
        invalid_option_out_of_range = "\n╔════════════════════════════════════════════════════════════════════════════╗n║    Opción no válida, solo puedes ingresar carácteres numéricos       ║\n╚════════════════════════════════════════════════════════════════════════════╝";
        enter_book_title_prompt = "\n╔══════════════════════════════╗\n║ Ingresa el título del libro  ║\n╚══════════════════════════════╝\n";
        invalid_title="\n╔═════════════════════════════════════════════════════════╗\n║        El libro debe tener un nombre, inténtalo de nuevo           ║\n╚═════════════════════════════════════════════════════════╝";
        enter_book_author_prompt = "\n╔═══════════════════════════════╗\n║ Ingresa el autor del libro  ║\n╚═══════════════════════════════╝\n";
        invalid_author="\n╔════════════════════════════════════════════════════════╗\n║    El libro debe tener un autor, inténtalo de nuevo.          ║\n╚════════════════════════════════════════════════════════╝";
        enter_book_isbn_prompt = "\n╔═════════════════════════════╗\n║ Ingresa el ISBN del libro  ║\n╚═════════════════════════════╝\n";
        invalid_isbn="\n╔══════════════════════════════════════════════════════════════╗\n║        El libro debe tener un código ISBN, inténtalo de nuevo.           ║\n╚══════════════════════════════════════════════════════════════╝";
        enter_book_genre_prompt = "\n╔══════════════════════════════╗\n║ Ingresa el género del libro  ║\n╚══════════════════════════════╝\n";
        invalid_genre="\n╔══════════════════════════════════════════════════════════════════════════╗\n║        El libro debe pertenecer a un género literario, inténtalo de nuevo.            ║\n╚══════════════════════════════════════════════════════════════════════════╝";
        enter_book_year_prompt = "\n╔════════════════════════════════════╗\n║ Ingresa el año de publicación del libro  ║\n╚════════════════════════════════════╝\n";
        year_of_publication_negative_error = "\n╔══════════════════════════════════════════════════════════════╗\n║        El año de publicación no puede ser negativo.           ║\n╚══════════════════════════════════════════════════════════════╝";
        year_of_publication_future_error = "\n╔══════════════════════════════════════════════════════════════╗\n║        El año de publicación aún no ha llegado. Ingresa un año válido (hasta 2025).  ║\n╚══════════════════════════════════════════════════════════════╝";
        book_entry_success = "\n╔════════════════════════════════════════╗\n║ El libro se registrará como disponible  ║\n╚════════════════════════════════════════╝";
        book_borrow_name_prompt = "\n╔═════════════════════════════════════════════════════════╗\n║     Ingresa el nombre del libro que deseas pedir prestado       ║\n╚═════════════════════════════════════════════════════════╝";
        no_active_loans_message = "\n╔════════════════════════════════════════════════╗\n║    Estos son los libros que has pedido prestados       ║\n╚════════════════════════════════════════════════╝";
        no_books_borrowed_message = "\nNo tienes préstamos activos";
        show_books_in_catalog_message = "\n╔════════════════════════════════════════════╗\n║  Este es nuestro catálogo actual de libros      ║\n╚════════════════════════════════════════════╝";               
        number_format_exception = "\n╔══════════════════════════════════════════════════════════════╗\n║        Solo puedes ingresar números, intenta de nuevo.         ║\n╚══════════════════════════════════════════════════════════════╝";
        exit_admin = "\n╔══════════════════════════════════════╗\n║  Saliendo del menú de administrador      ║\n╚══════════════════════════════════════╝";
        singning_out = "\n╔═══════════════════════════════╗\n║  Cerrando sesión de tu cuenta  ║\n╚═══════════════════════════════╝";
        return_to_menu = "\nPresiona ENTER para volver al menú...";
        invalid_new_username = "\n╔══════════════════════════════════════════════════════════════════════════════════╗\n║          Ingresa un nombre de usuario válido, no puede estar vacío, inténtalo de nuevo            ║\n╚══════════════════════════════════════════════════════════════════════════════════╝";
        invalid_new_password = "\n╔═══════════════════════════════════════════════════════════════╗\n║     La contraseña no puede dejarse en blanco, intenta de nuevo       ║\n╚═══════════════════════════════════════════════════════════════╝";
        registered_people ="\n╔══════════════════════════════════════════════╗\n║ Las personas registradas en el sistema son:     ║\n╚══════════════════════════════════════════════╝";
        show_active_loans ="\nMostrando préstamos activos...";
        select_an_option = "\nSelecciona una opción: ";
        author="Autor: ";
        title ="Título: ";
        isbn="ISBN: ";
        genre="Género: ";
        year_book="Año de publicación: ";
        username="Nombre de usuario: ";
        password="Contraseña: ";
    }
}
