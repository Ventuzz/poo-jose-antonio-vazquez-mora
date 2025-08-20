package edu.jose.vazquez.actividades.avanceproyecto.lang;

public class Eng extends Lang {
    public Eng() {
        menu_login="\n╔═══════════════════════════╗\n║           Login           ║\n╠═══════════════════════════╣\n║ I don't have an account   ║\n║ 1. Register               ║\n║                           ║\n║ I already have an account ║\n║ 2. Sign in                ║\n║                           ║\n║ 3. Exit                   ║\n╚═══════════════════════════╝";
        menu_admin="\n╔═══════════════════════════════════════════════════════════╗\n║                       Admin MENU                          ║\n╠═══════════════════════════════════════════════════════════╣\n║     1. Consult people registered in the library           ║\n║     2. Add new books to the library                       ║\n║     3. Show books in stock                                ║\n║     4. Check active loans                                 ║\n║     5. Exit                                               ║\n╚═══════════════════════════════════════════════════════════╝";
        menu_user="\n╔══════════════════════════════════════════════╗\n║                    MENU                      ║\n╠══════════════════════════════════════════════╣\n║     1. Check available books                 ║\n║     2. Request the loan of a book            ║\n║     3. Active loans                          ║\n║     4. Exit                                  ║\n╚══════════════════════════════════════════════╝";
        
        invalid_option="\n╔════════════════════════════════════════════════════════════════════════════╗\n║  Invalid option, you can only enter numbers in the menu         ║\n╚════════════════════════════════════════════════════════════════════════════╝";
        username_prompt="\n╔═════════════════════════════════╗\n║ Excellent, Enter your username: ║\n╚═════════════════════════════════╝\n";
        password_prompt="\n╔═══════════════════════════════╗\n║   Now enter your password     ║\n╚═══════════════════════════════╝\n";
        welcome_admin="\n╔═══════════════════════════╗\n║  Welcome Administrator    ║\n╚═══════════════════════════╝";
        welcome_user="\n╔═══════════════════════╗\n║  Welcome, ";
        welcome_user_format="║\n╚═══════════════════════╝";
        goodbye="\n╔════════════╗\n║  Goodbye!  ║\n╚════════════╝";
        register_user="\n╔═══════════════════════════════════╗\n║   Enter a username to register    ║\n╚═══════════════════════════════════╝";
        register_password="\n╔═══════════════════════════════════╗\n║     Enter a secure password       ║\n╚═══════════════════════════════════╝";
        registration_success="\n╔═════════════════════════════════╗\n║  Account created successfully!  ║\n╚═════════════════════════════════╝";
        invalid_credentials="\n╔═══════════════════════════╗\n║    Invalid credentials    ║\n╚═══════════════════════════╝";
        book_added="\n╔══════════════════════════════════════════╗\n║  Book successfully added to the catalog! ║\n╚══════════════════════════════════════════╝";
        book_borrow_success="\nBook borrowed successfully";
        book_not_available="\nThe book is not available";
        invalid_input_empty = "\n╔═════════════════════════════════════════════════════╗\n║  Invalid option, you cannot leave the entry empty   ║\n╚═════════════════════════════════════════════════════╝";
        invalid_input_not_number = "\n╔═══════════════════════════════════════════════════════════╗\n║       Invalid option, please enter a number         ║\n╚═══════════════════════════════════════════════════════════╝";
        invalid_option_out_of_range = "\n╔════════════════════════════════════════════════════════════════════════════╗\n║    Invalid option, you cannot enter numbers that are not in the menu       ║\n╚════════════════════════════════════════════════════════════════════════════╝";
        enter_book_title_prompt = "\n╔══════════════════════════════╗\n║ Enter the title of the book  ║\n╚══════════════════════════════╝\n";
        invalid_title="\n╔═════════════════════════════════════════════════════════╗\n║        The book has to have a name, Try again           ║\n╚═════════════════════════════════════════════════════════╝";
        enter_book_author_prompt = "\n╔═══════════════════════════════╗\n║ Enter the author of the book  ║\n╚═══════════════════════════════╝\n";
        invalid_author="\n╔════════════════════════════════════════════════════════╗\n║    The book has to have an author, Try again.          ║\n╚════════════════════════════════════════════════════════╝";
        enter_book_isbn_prompt = "\n╔═════════════════════════════╗\n║ Enter the ISBN of the book  ║\n╚═════════════════════════════╝\n";
        invalid_isbn="\n╔══════════════════════════════════════════════════════════════╗\n║        The book must have an ISBN code, try again.           ║\n╚══════════════════════════════════════════════════════════════╝";
        enter_book_genre_prompt = "\n╔══════════════════════════════╗\n║ Enter the genre of the book  ║\n╚══════════════════════════════╝\n";
        invalid_genre="\n╔══════════════════════════════════════════════════════════════════════════╗\n║        The book has to belong to a literary genre, Try Again.            ║\n╚══════════════════════════════════════════════════════════════════════════╝";
        enter_book_year_prompt = "\n╔════════════════════════════════════╗\n║ Enter the year of publication of the book  ║\n╚════════════════════════════════════╝\n";
        year_of_publication_negative_error = "\n╔══════════════════════════════════════════════════════════════╗\n║        The year of publication cannot be negative.           ║\n╚══════════════════════════════════════════════════════════════╝";
        year_of_publication_future_error = "\n╔══════════════════════════════════════════════════════════════╗\n║        The year of publication has not yet arrived. Please enter a valid year (until 2025).  ║\n╚══════════════════════════════════════════════════════════════╝";
        book_entry_success = "\n╔════════════════════════════════════════╗\n║ The book will be entered as available  ║\n╚════════════════════════════════════════╝";
        book_borrow_name_prompt = "\n╔═════════════════════════════════════════════════════════╗\n║     Enter the name of the book you want to borrow       ║\n╚═════════════════════════════════════════════════════════╝";
        no_active_loans_message = "\n╔════════════════════════════════════════════════╗\n║    These are the books you have borrowed       ║\n╚════════════════════════════════════════════════╝";
        no_books_borrowed_message = "\nYou do not have active loans";
        show_books_in_catalog_message = "\n╔════════════════════════════════════════════╗\n║  This is our current catalog of books      ║\n╚════════════════════════════════════════════╝";               
        number_format_exception = "\n╔══════════════════════════════════════════════════════════════╗\n║        You can only enter numbers, please try again.         ║\n╚══════════════════════════════════════════════════════════════╝";
        exit_admin = "\n╔══════════════════════════════════════╗\n║  Exiting the administrator menu      ║\n╚══════════════════════════════════════╝";
        singning_out = "\n╔═══════════════════════════════╗\n║  Signing out of your account  ║\n╚═══════════════════════════════╝";
        return_to_menu = "\nPress ENTER to return to the menu...";
        invalid_new_username = "\n╔══════════════════════════════════════════════════════════════════════════════════╗\n║          Please enter a valid username, it cannot be empty, try again            ║\n╚══════════════════════════════════════════════════════════════════════════════════╝";
        invalid_new_password = "\n╔═══════════════════════════════════════════════════════════════╗\n║     The password cannot be left blank, please try again       ║\n╚═══════════════════════════════════════════════════════════════╝";
        registered_people ="\n╔══════════════════════════════════════════════╗\n║ The people registered in the system are:     ║\n╚══════════════════════════════════════════════╝";
        show_active_loans ="\nShowing active loans...";
        select_an_option = "\nSelect an option: ";
        author="Author: ";
        title ="Title: ";
        isbn="ISBN: ";
        genre="Genre: ";
        year_book="Year of publication: ";
        username="Username: ";
        password="Password: ";
    }
}

