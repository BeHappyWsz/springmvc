package springmvc.entity;

import java.util.HashSet;
import java.util.Set;
/**
 * 绑定Set数据辅助类
 * @author wsz
 * @date 2018年3月1日
 */
public class UserSetForm {

	private Set<User> users ;
	
	/**
	 * 必须先进行add
	 */
	public UserSetForm() {
		users = new HashSet<User>(16);
		users.add(new User());
		users.add(new User());
		users.add(new User());
		users.add(new User());
	}
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "UserSetForm [users=" + users + "]";
	}
	
}
