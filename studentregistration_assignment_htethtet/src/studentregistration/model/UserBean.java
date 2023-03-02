package studentregistration.model;

import javax.validation.constraints.NotEmpty;

public class UserBean {
	@NotEmpty
	private String userId;	
	private String userName;
	@NotEmpty
	private String userPassword;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}	
}
