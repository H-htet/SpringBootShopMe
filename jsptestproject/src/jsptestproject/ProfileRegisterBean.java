package jsptestproject;

public class ProfileRegisterBean {
	private String email, password, comfirm_password, name, gender, course, education;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getComfirm_password() {
		return comfirm_password;
	}

	public void setComfirm_password(String comfirm_password) {
		this.comfirm_password = comfirm_password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String toString() {
		return email + " " + password +" "+ comfirm_password +" "+ name +" "+ gender +" "+ course +" "+ education;
	}
		
}
