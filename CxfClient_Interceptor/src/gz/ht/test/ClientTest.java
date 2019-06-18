package gz.ht.test;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import gz.ht.pojo.UserInfo;
import gz.ht.service.IHelloService;

public class ClientTest {
	public static void main(String args[]){  
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-client.xml");  
        //实例化客户端对象，调用拦截器方法
        IHelloService helloServices = context.getBean("helloClient",IHelloService.class);  
        List<UserInfo> users = new ArrayList<UserInfo>();  
        users.add(new UserInfo("vicky","张三",23));  
        users.add(new UserInfo("caty","李四",23));  
        users.add(new UserInfo("ivy","王五",23));  
        users.add(new UserInfo("kelly","赵六",23));  
        String helloAll = helloServices.sayHelloToAll(users);  
        System.out.println(helloAll);  
        System.out.println(helloServices.sayHello("吴彦祖"));
    }  
}
