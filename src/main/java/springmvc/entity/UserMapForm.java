package springmvc.entity;

import java.util.Map;
/**
 * ��ȡMap���ݸ�����
 * @author wsz
 * @date 2018��3��1��
 */
public class UserMapForm {

	private Map<String,User> users;

	public Map<String, User> getUsers() {
		return users;
	}

	public void setUsers(Map<String, User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "UserMapForm [users=" + users + "]";
	}
	
}
