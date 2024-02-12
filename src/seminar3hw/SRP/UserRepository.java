package seminar3hw.SRP;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> userList;

    public UserRepository() {
        userList = new ArrayList<>();
    }

    public void add(User user) {
        userList.add(user);
    }
}
