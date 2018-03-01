package springmvc.entity;

import java.util.HashSet;
import java.util.Set;
/**
 * ��Set���ݸ�����
 * @author wsz
 * @date 2018��3��1��
 */
public class UserSetForm {

	private Set<User> users ;
	
	/**
	 * �����Ƚ���add
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
