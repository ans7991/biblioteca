import java.util.Scanner;

public class PublicLibraryMenu
{
    String response;
    int choice;
    int bookNo;

    public void DisplayMenu()
    {
        System.out.println("Read the Menu below:");
        System.out.println("1. View All Books");
        System.out.println("2. Reserve A Book");
        System.out.println("3. Check Your Library Number");
        System.out.println("Please Enter Your Choice:.... ");
    }

    public static void main(String args[])
    {
        Book[] books = new Book[3];
        books[0] = new Book(101, "Gone with the Wind");
        books[1] = new Book(102, "A Brief History Of Time");
        books[2] = new Book(103, "Head First Java");
        Bibliotica EnterLibrary = new Bibliotica();
        PublicLibraryMenu User = new PublicLibraryMenu();
        System.out.println(EnterLibrary.WelcomeMessage());
        do
        {
            User.DisplayMenu();
            Scanner input = new Scanner(System.in);
            User.choice = input.nextInt();
            User.ExecuteChoice(User.choice, books);
            System.out.println("Do you want to Continue(Yes/No):....");
            User.response = input.next();
        }
        while(User.response.equals("Yes"));
    }

    public void ExecuteChoice(int choice, Book[] books)
    {
        PublicLibraryMenu NewUser = new PublicLibraryMenu();
        Bibliotica EnterLib = new Bibliotica();
        switch(choice)
        {
            case 1: System.out.println("The following books are available..");
                EnterLib.ViewBooks(books);
                break;

            case 2: System.out.println("Enter the Book Number: ");
                Scanner input = new Scanner(System.in);
                NewUser.bookNo = input.nextInt();
                System.out.println(EnterLib.ReserveABook(NewUser.bookNo, books));
                break;

            case 3: System.out.println(EnterLib.CheckLibraryNumber());
                break;

            default: System.out.println(EnterLib.NotValidOption());
        }

    }
}