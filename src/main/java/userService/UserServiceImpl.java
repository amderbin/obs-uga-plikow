package userService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    List<User> users;

    public UserServiceImpl() {
        this.users= new ArrayList<User>();
    }
    public UserServiceImpl(List<User> users) {
        this.users = users;
    }

    public List<User> getAllUsers() {
        return users;
    }


    public void addUser(User user) {
        users.add(user);

    }


    public void removeUserById(Long userId) {
        for(int i =0; i < users.size(); i++){
            User userForList = users.get(i);
            if(userForList.getId() == userId ){
                users.remove(i);
                break;

            }
        }

    }
}
