package Home_Work6;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UserUtils {
    public static User[] uniqueUsers(User[] users){
        List<User> list = new LinkedList<>();
        if (users != null) list.add(users[0]);

        for (int i = 1; i < users.length; i++){
            if (!list.contains(users[i]) && users[i] != null) list.add(users[i]);
        }

        User[] result = new User[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static User[] deleteEmptyUsers(User[] users){
        List<User> list = new LinkedList<>();
        for (User u: users){
            if (u != null) list.add(u);
        }

        User[] result = new User[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;

    }

    public static User[] usersWithConditionalBalance(User[] users, int balance){
        List<User> list = new LinkedList<>();

        User[] u = UserUtils.deleteEmptyUsers(users);

        for (int i = 0; i < u.length; i++){
            if (u[i].getBalance() == balance) list.add(u[i]);
        }

        User[] result = new User[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public  static User[] paySalaryToUsers(User[] users){

        User[] unique = UserUtils.deleteEmptyUsers(users);
        unique = UserUtils.uniqueUsers(unique);

        for (User u: unique){
            if (u != null) u.setBalance(u.getSalary() + u.getBalance());
        }
        return unique;
    }

    public static long[] getUsersId(User[] users){

        User[] u = UserUtils.uniqueUsers(users);
        u = UserUtils.deleteEmptyUsers(u);
        long[] ids = new long[u.length];

        for (int i = 0; i < ids.length; i++){
           ids[i] = u[i].getId();
        }
        return ids;
    }


}
