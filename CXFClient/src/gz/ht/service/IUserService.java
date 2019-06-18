package gz.ht.service;

import java.util.List;
import javax.jws.WebParam;
import javax.jws.WebService;

import gz.ht.pojo.User;
/** 
 *  @WebService：申明为webservice的注解  
 *  @author zsc 
 */
@WebService
public interface IUserService {
	/** 
     * @WebParam(name = "name"):自定义请求参数的名称 
     * @param name 
     * @param loginName 
     * @param age 
     * @return 
     */  
    public User registerUser(
            @WebParam(name = "name") String name,  
            @WebParam(name = "loginName") String loginName,  
            @WebParam(name = "age") int age);  
    public List<User> getRegistedUsers();
}
