import java.util.ArrayList;

public class UserList
{
    int index;
    public ArrayList<User> users = new ArrayList<User>();
    boolean  userExist = false;

    UserList()
    {
        users.add(new User("111-1111", "1234"));
        users.add(new User("111-1112", "wxyz"));
        users.add(new User("111-1113", "abcd"));
        users.add(new User("111-1114", "7991"));
    }

    public void checkPassword(User user)
    {
        for(User userIterator: users)
        {
            if(user.userName.equals(userIterator.userName) && user.password.equals(userIterator.password))
            {
                userIterator.loggedIn = true;
                index = users.indexOf(userIterator);
                System.out.println("You are logged in.");
                userExist = true;
                break;
            }
            userExist = false;
        }
        if(!userExist)
        {
            System.out.println("Wrong Username or Password.");
            userExist = false;
        }
    }
}
