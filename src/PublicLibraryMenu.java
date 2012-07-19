import java.util.Scanner;

public class PublicLibraryMenu
{
    public static void main(String args[])
    {
        String response;
        int choice;
        int bookNo;
        Bibliotica EnterLibrary = new Bibliotica();
        System.out.println(EnterLibrary.WelcomeMessage());
        do
        {
            System.out.println("Read the Menu below:");
            System.out.println("1. View All Books");
            System.out.println("2. Reserve A Book");
            System.out.println("3. Check Your Library Number");
            System.out.println("Please Enter Your Choice:.... ");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            switch(choice)
            {
                case 1: System.out.println("The following books are available..");
                        EnterLibrary.ViewBooks();
                    break;

                case 2: System.out.println("Enter the Book Number: ");
                        bookNo = input.nextInt();
                        if(EnterLibrary.ReserveABook(bookNo))
                            System.out.println("Thank You! Enjoy the Book.");
                        else
                            System.out.println("Sorry we don't have that book yet.");
                    break;

                case 3: System.out.println(EnterLibrary.CheckLibraryNumber());
                    break;

                default: System.out.println(EnterLibrary.NotValidOption());
            }

            System.out.println("Do you want to Continue(Yes/No):....");
            response = input.next();
        }
        while(response.equals("Yes"));
    }
}