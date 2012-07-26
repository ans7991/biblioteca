import java.util.Scanner;

public class PublicLibraryMenu
{

    Scanner input = new Scanner(System.in);
    public void DisplayMenu()
    {
        System.out.println("Read the Menu below:");
        System.out.println("1. View All Books");
        System.out.println("2. Reserve A Book");
        System.out.println("3. Check Your Library Number");
        System.out.println("4. View Movies List");
        System.out.println("5. Login");
        System.out.println("Please Enter Your Choice:.... ");
    }

    public void ExecuteChoice(int choice,  Bibliotica Library)
    {
        PublicLibraryMenu menu = new PublicLibraryMenu();
        switch(choice)
        {
            case 1: System.out.println("The following books are available..");
                Library.ViewBooks();
                break;

            case 2: System.out.println("Enter the Book Number: ");
                System.out.println(Library.ReserveABook(input.nextInt()));
                break;

            case 3: System.out.println(Library.CheckLibraryNumber());
                break;

            case 4: System.out.println("Movies Name   Director   Rating");
                Library.ListMovies();
                break;

            case 5: System.out.println("Enter Username: ");
                String username = input.next();
                System.out.println("Enter Password: ");
                String password = input.next();
                User user = new User(username, password);
                Library.checkPassword(user);
                break;

            default: System.out.println(Library.NotValidOption());
        }

    }

    public static void main(String args[])
    {
        String response;
        Bibliotica Library = new Bibliotica();
        PublicLibraryMenu Menu = new PublicLibraryMenu();
        System.out.println(Library.WelcomeMessage());
        do
        {
            Menu.DisplayMenu();
            Scanner dataIn = new Scanner(System.in);
            Menu.ExecuteChoice(dataIn.nextInt(), Library);
            System.out.println("Do you want to Continue(Yes/No):....");
            response = dataIn.next();
        }
        while(response.equals("Yes"));
    }
}