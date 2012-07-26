import java.util.ArrayList;

public class Bibliotica
{

    private boolean bookFound = false;
    private boolean userExist = false;
    private int index;
    BookLibrary bookLibrary = new BookLibrary();
    MovieLibrary movieLibrary = new MovieLibrary();
    UserList userList = new UserList();

    public String WelcomeMessage()
    {
        return "Hello Customer!";
    }

    public void ViewBooks()
    {
        for(int i=0;i<bookLibrary.Books.size();i++)
            bookLibrary.Books.get(i).displayBook();
    }

    public String ReserveABook(int bookNo)
    {
        for(int i=0;i<bookLibrary.Books.size();i++)
            if(bookNo == bookLibrary.Books.get(i).getBookNo())
                bookFound = true;
        if(bookFound)
            return "Thank You! Enjoy the Book.";
        else
            return "Sorry! We don't have that book yet.";
    }

    public String CheckLibraryNumber()
    {
        if(userExist)
            return "Your Library Number is " + userList.Users.get(index).userName;
        else
            return "Please talk to librarian. Thank You.";
    }

    public void ListMovies()
    {
        for(int i=0;i<movieLibrary.Movies.size();i++)
            movieLibrary.Movies.get(i).displayMovie();
    }

    public void checkPassword(User user)
    {
        for(User userIterator: userList.Users)
        {
            if(user.userName.equals(userIterator.userName) && user.password.equals(userIterator.password))
            {
                userIterator.loggedIn = true;
                index = userList.Users.indexOf(userIterator);
                System.out.println("You are logged in.");
                userExist = true;
                break;
            }
        }
        if(!userExist)
            System.out.println("Wrong Username or Password.");
    }

    public String NotValidOption()
    {
        return "Select a Valid Option!";
    }

    private void isLibrarian()
    {
        for(User userIterator: userList.Users)
        {
            if(userIterator.userName.equals("111-1111"))
                userIterator.isLibrarian = true;
            else
                userIterator.isLibrarian = false;
        }
    }
}