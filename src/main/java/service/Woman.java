package service;

public class Woman implements IPerson {

	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("我是"+username);
	}

}
