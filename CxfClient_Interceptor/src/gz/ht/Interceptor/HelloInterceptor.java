package gz.ht.Interceptor;
import java.util.List;
import javax.xml.namespace.QName;  
import org.apache.cxf.binding.soap.SoapMessage;  
import org.apache.cxf.headers.Header;  
import org.apache.cxf.helpers.DOMUtils;  
import org.apache.cxf.interceptor.Fault;  
import org.apache.cxf.phase.AbstractPhaseInterceptor;  
import org.apache.cxf.phase.Phase;  
import org.w3c.dom.Document;  
import org.w3c.dom.Element;
public class HelloInterceptor extends AbstractPhaseInterceptor<SoapMessage>{
	 private String name;  
	 private String password; 
	public HelloInterceptor(String name,String password) {
		//准备协议化时拦截
		super(Phase.PRE_PROTOCOL);
		this.name = name;  
	    this.password =password;  
	    System.out.println("HelloInterceptor"); 
	}
	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		List<Header> headers = message.getHeaders();         
		Document document = DOMUtils.createDocument();   
		Element rootEle = document.createElement("authUser");  
		Element nameEle = document.createElement("name");  
		nameEle.setTextContent(name);  
		rootEle.appendChild(nameEle);  
		Element passwordEle = document.createElement("password");  
		passwordEle.setTextContent(password);  
		rootEle.appendChild(passwordEle);  
		headers.add(new Header(new QName("authUser"), rootEle));  
		System.out.println("client HandMessage()...."); 
	}

}
