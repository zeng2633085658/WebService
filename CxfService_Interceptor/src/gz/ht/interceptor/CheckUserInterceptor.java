package gz.ht.interceptor;

import javax.xml.namespace.QName;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
/**  
 * 检查用户的拦截器  
 * @author zsc  
 */
public class CheckUserInterceptor extends AbstractPhaseInterceptor<SoapMessage>{
	public CheckUserInterceptor() {
		//准备协议化时拦截
		super(Phase.PRE_PROTOCOL);
		System.out.println("CheckUserInterceptor() ");  
	}
	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		//获取SOAP携带的所有Header 
		Header header = message.getHeader(new QName("authUser"));
		if (header != null) {
			Element authUser = (Element) header.getObject();
			//获取元素中的文本内容  
			String name = authUser.getElementsByTagName("name").item(0).getTextContent();
			String password = authUser.getElementsByTagName("password").item(0).getTextContent();
			//实际项目中,是从数据库中取数据做校验  
			if ("xiaoming".equalsIgnoreCase(name) && "123456".equals(password)) {
				System.out.println("server 通过认证拦截器。。。");
				return;
			}
		}
		//不能通过
		System.out.println("server 没有通过认证拦截器。。。");
		throw new Fault(new RuntimeException("请求输入一个正确的用户名密码")); 
	}
}
