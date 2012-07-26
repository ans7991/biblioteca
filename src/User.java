import java.awt.*;
import java.lang.invoke.WrongMethodTypeException;

public class User
{
    String userName;
    String password;
    boolean loggedIn;
    boolean isLibrarian;

    User(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
        loggedIn = false;
    }
}
