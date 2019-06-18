package gz.ht.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 * 定义对象演示
 * @author zsc
 */
@XmlRootElement(name = "User")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "name", "loginName", "age" })
public class User {
	// 请使用基本属性类型
	private String name;
	private String loginName;
	private int age;
	/**
	 * ※ 需要※ 无参数默认构造器
	 */
	public User() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String name, String loginName, Integer age) {
		this.name = name;
		this.loginName = loginName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", loginName=" + loginName + ", age=" + age + "]";
	}
}