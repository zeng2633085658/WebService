package gz.ht.test;

import javax.xml.ws.Endpoint;
import gz.ht.service.IUserService;
import gz.ht.service.UserServiceImpl;

/**
 * 发布WebServie服务测试类
 * @author zsc
 */
public class TestCXFWebService {
	public static void main(String[] args) {
		/*
		 // 第一种发布方式  
		IUserService userService = new UserServiceImpl();  
        // 创建WebServices服务接口  
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();  
        // 注册webservices接口  
        factory.setServiceClass(IUserService.class);  
        // 发布接口  
        factory.setAddress("http://localhost:8090/CXFWebService");  
        factory.setServiceBean(userService);  
        // 创建服务  
        factory.create();  
        */
		System.out.println("CXFWebService is starting!");
		
		IUserService userService = new UserServiceImpl();
		//发布的地址
		String address = "http://127.0.0.1:8090/CXFWebService";
		//发布web service
		Endpoint.publish(address, userService);
		System.out.println("CXFWebService is started!");
	}
}
