import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> Users = new ArrayList<User>();

    UserList()
    {
        Users.add(new User("111-1111", "1234"));
        Users.add(new User("111-1112", "wxyz"));
        Users.add(new User("111-1113", "abcd"));
        Users.add(new User("111-1114", "7991"));
    }
}
