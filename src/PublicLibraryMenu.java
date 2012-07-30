import java.util.Scanner;

public class PublicLibraryMenu
{

    Scanner input = new Scanner(System.in);
    public void displayMenu()
    {
        System.out.println("Read the Menu below:");
        System.out.println("1. View All Books");
        System.out.println("2. Reserve A Book");
        System.out.println("3. Check Your Library Number");
        System.out.println("4. View Movies List");
        System.out.println("5. Login");
        System.out.println("Please Enter Your Choice:.... ");
    }

    public void executeChoice(int choice,  Bibliotica library)
    {
        switch(choice)
        {
            case 1: System.out.println("The following books are available..");
                library.bookLibrary.viewBooks();
                break;

            case 2: System.out.println("Enter the Book Number: ");
                System.out.println(library.bookLibrary.reserveABook(input.nextInt()));
                break;

            case 3: System.out.println(library.checkLibraryNumber());
                break;

            case 4: System.out.println("Movies Name   Director   Rating");
                library.movieLibrary.listMovies();
                break;

            case 5: System.out.println("Enter Username: ");
                String username = input.next();
                System.out.println("Enter Password: ");
                String password = input.next();
                User user = new User(username, password);
                library.userList.checkPassword(user);
                break;

            default: System.out.println(library.notValidOption());
        }

    }

    public static void main(String args[])
    {
        String response;
        Bibliotica library = new Bibliotica();
        PublicLibraryMenu menu = new PublicLibraryMenu();
        System.out.println(library.welcomeMessage());
        do
        {
            menu.displayMenu();
            Scanner dataIn = new Scanner(System.in);
            menu.executeChoice(dataIn.nextInt(), library);
            System.out.println("Do you want to Continue(Yes/No):....");
            response = dataIn.next();
        }
        while(response.equals("Yes"));
    }
}