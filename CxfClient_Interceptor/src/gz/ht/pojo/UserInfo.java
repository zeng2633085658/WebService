package gz.ht.pojo;
/**
 * 定义对象演示
 * @author zsc
 */
public class UserInfo {
	// 请使用基本属性类型
	private String name;
	private String loginName;
	private int age;
	/**
	 * ※ 需要※ 无参数默认构造器
	 */
	public UserInfo() {
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

	public UserInfo(String name, String loginName, Integer age) {
		this.name = name;
		this.loginName = loginName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", loginName=" + loginName + ", age=" + age + "]";
	}
}