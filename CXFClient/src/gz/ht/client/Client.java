package gz.ht.client;

import java.util.List;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import gz.ht.pojo.User;
import gz.ht.service.IUserService;

public class Client {
	public static void main(String[] args) {
		
		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();    
        factoryBean.setServiceClass(IUserService.class);    
        factoryBean.setAddress("http://127.0.0.1:8090/CXFWebService");    
        IUserService userService  = (IUserService) factoryBean.create();    
        User user = userService.registerUser("张三", "superman", 28);  
        System.out.println(user.toString());
        List<User> list = userService.getRegistedUsers();  
        System.out.println("--------------------------------");
        for(User u:list){
        	System.out.println(u);
        }
	}
}
