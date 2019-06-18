package gz.ht.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import gz.ht.pojo.UserInfo;
import gz.ht.service.IHelloService;

//使用注解的方式
@WebServlet(name="ClientServlet",urlPatterns="/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-client.xml");  
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
