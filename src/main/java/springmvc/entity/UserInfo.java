package springmvc.entity;

public class UserInfo {

	private String phone;
	
	private String address;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserInfo [phone=" + phone + ", address=" + address + "]";
	}
	
}
