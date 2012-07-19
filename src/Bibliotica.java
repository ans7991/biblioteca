import java.util.Scanner;

public class Bibliotica
{

    boolean bookFound = false;
    Book[] books;

    Bibliotica()
    {
        books = new Book[3];
        books[0] = new Book(101, "Gone with the Wind");
        books[1] = new Book(102, "A Brief History Of Time");
        books[2] = new Book(103, "Head First Java");
    }

    public String WelcomeMessage()
    {
        return "Hello Customer!";
    }

    public void ViewBooks()
    {
        for(int i=0;i<books.length;i++)
            System.out.println(books[i].bookNo + "  " + books[i].bookName);
    }

    public boolean ReserveABook(int bookNo)
    {
        for(int i=0;i<books.length;i++)
            if(bookNo == books[i].bookNo)
                bookFound = true;
        return bookFound;
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