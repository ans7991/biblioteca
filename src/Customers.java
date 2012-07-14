import java.util.Scanner;

public class Customers
{
    public static void main(String args[])
    {
        String response;
        Bibliotica EnterLibrary= new Bibliotica();
        System.out.println(EnterLibrary.WelcomeMessage());
        do
        {
            System.out.println("Read the Menu below:");
            System.out.println("1. View All Books");
            System.out.println("2. Reserve A Book");
            System.out.println("3. Check Your Library Number");
            System.out.println("Please Enter Your Choice:.... ");
            Scanner input=new Scanner(System.in);
            EnterLibrary.choice=input.nextInt();
            switch(EnterLibrary.choice)
            {
                case 1: System.out.println(EnterLibrary.ViewBooks());
                    // Display the available books
                    break;
                case 2: EnterLibrary.ReserveABook();
                    break;
                case 3: System.out.println(EnterLibrary.CheckLibraryNumber());
                    break;
                default: System.out.println(EnterLibrary.NotValidOption());
            }
            System.out.println("Do you want to Continue(Yes/No):....");
            response=input.next();
        }
        while(response.equals("Yes"));
    }
}
