import java.util.Scanner;

public class Bibliotica
{
    int bookNo;
    int bookFound=0;
    int choice;
    public String WelcomeMessage()
    {
        return "Hello Customer!";
    }
    public String ViewBooks()
    {
        return "The Following books are Available:";
    }
    public void ReserveABook()
    {
        System.out.println("Please Enter the Book Number:...");
        Scanner dataIn  = new Scanner(System.in);
        bookNo=dataIn.nextInt();
        // Check if the book is available
        // If book is available, set bookFound=1
        if(bookFound==1)
            System.out.println("Thank You! Enjoy the Book.");
        else
            System.out.println("Sorry we don't have that book yet.");
    }
    public String CheckLibraryNumber()
    {
        return "Please Talk to Librarian. Thank You.";
    }
    public String NotValidOption()
    {
        return "Select a Valid Option!";
    }
}