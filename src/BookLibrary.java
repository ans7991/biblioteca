import java.util.ArrayList;

public class BookLibrary
{
    ArrayList<Book> Books = new ArrayList<Book>();

    BookLibrary()
    {
        Books.add(new Book(101, "Gone with the Wind"));
        Books.add(new Book(102, "A Brief History Of Time"));
        Books.add(new Book(103, "Head First Java"));
        Books.add(new Book(104, "Oliver Twist"));
    }
}
