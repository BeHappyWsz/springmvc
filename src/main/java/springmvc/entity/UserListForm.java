package springmvc.entity;

import java.util.List;
/**
 * 绑定List数据辅助类
 * @author wsz
 * @date 2018年3月1日
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
