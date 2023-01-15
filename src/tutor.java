
public class tutor {
	private String name;
	private String email;
	private String school;
	public tutor(String nName, String nEmail, String nSchool) {
		name = nName;
		email = nEmail;
		school = nSchool;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
}
