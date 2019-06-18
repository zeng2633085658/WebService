package gz.ht.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import gz.ht.pojo.UserInfo;

@WebService
public interface IHelloService {
	@WebMethod
	public String sayHello(String name);  
	@WebMethod
    public String sayHelloToAll(List<UserInfo> users);  
}
