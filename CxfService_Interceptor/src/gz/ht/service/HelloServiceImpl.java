package gz.ht.service;

import java.util.List;
import javax.jws.WebService;
import gz.ht.pojo.UserInfo;
@WebService
public class HelloServiceImpl implements IHelloService{
	public String sayHello(String name) {  
        return "Hello "+name+" .";  
    }  
    public String sayHelloToAll(List<UserInfo> users) {  
        String hello = "hello ";  
        for(UserInfo user:users){  
            hello += user.getLoginName()+" ,";  
        }  
        hello += " ,everybody.";  
        return hello;  
    }  
}
