package springmvc.entity;

import java.util.List;
/**
 * ��List���ݸ�����
 * @author wsz
 * @date 2018��3��1��
 */
public class UserListForm {

	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "UserListForm [users=" + users + "]";
	}
	
}
