package gz.ht.service;

import java.util.ArrayList;
import java.util.List;
import gz.ht.pojo.User;
public class UserServiceImpl implements IUserService{
	private static List<User> userList = new ArrayList<User>();  
    @Override  
    public User registerUser(String name, String loginName, int age) {     
        User user = new User(name, loginName, age);  
        userList.add(user);  
        return user;  
    } 
    @Override
    public List<User> getRegistedUsers() {  
        for(int i=0;i<2;i++){  
            User tempUser = new User("name"+i, "loginName"+i, 18+i);  
            userList.add(tempUser);  
        }
        System.out.println("");
        return userList;  
    }
}