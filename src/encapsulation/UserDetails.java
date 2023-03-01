package encapsulation;

public class UserDetails {
	String name;
	private String password;
	
	public UserDetails(String name) {
		super();
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void dispalyUser() {
		System.out.println("Name:"+this.name);
	}

}
