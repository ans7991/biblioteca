import java.util.ArrayList;

public class Bibliotica
{

    BookLibrary bookLibrary = new BookLibrary();
    MovieLibrary movieLibrary = new MovieLibrary();
    UserList userList = new UserList();

    public String welcomeMessage()
    {
        return "Hello Customer!";
    }

    public String checkLibraryNumber()
    {
        if(userList.userExist)
            return "Your Library Number is " + userList.users.get(userList.index).userName;
        else
            return "Please talk to librarian. Thank You.";
    }

    public String notValidOption()
    {
        return "Select a Valid Option!";
    }

    private void isLibrarian()
    {
        for(User userIterator: userList.users)
        {
            if(userIterator.userName.equals("111-1111"))
                userIterator.isLibrarian = true;
            else
                userIterator.isLibrarian = false;
        }
    }
}