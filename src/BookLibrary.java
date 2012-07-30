import java.util.ArrayList;

public class BookLibrary
{
    boolean bookFound;
    ArrayList<Book> books = new ArrayList<Book>();

    BookLibrary()
    {
        books.add(new Book(101, "Gone with the Wind"));
        books.add(new Book(102, "A Brief History Of Time"));
        books.add(new Book(103, "Head First Java"));
        books.add(new Book(104, "Oliver Twist"));
    }

    public void viewBooks()
    {
        for(int i=0;i<books.size();i++)
            books.get(i).displayBook();
    }

    public String reserveABook(int bookNo)
    {
        for(int i=0;i<books.size();i++)
            if(bookNo == books.get(i).getBookNo())
                bookFound = true;
        if(bookFound)
            return "Thank You! Enjoy the Book.";
        else
            return "Sorry! We don't have that book yet.";
    }

}
