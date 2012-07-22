import java.util.Scanner;

public class Bibliotica
{

    boolean bookFound;

    public Bibliotica()
    {
        bookFound = false;
    }

    public String WelcomeMessage()
    {
        return "Hello Customer!";
    }

    public void ViewBooks(Book[] books)
    {
        for(int i=0;i<books.length;i++)
            System.out.println(books[i].bookNo + "  " + books[i].bookName);
    }

    public String ReserveABook(int bookNo, Book[] books)
    {
        for(int i=0;i<books.length;i++)
            if(bookNo == books[i].bookNo)
                bookFound = true;
        if(bookFound)
            return "Thank You! Enjoy the Book.";
        else
            return "Sorry! We don't have that book yet.";
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