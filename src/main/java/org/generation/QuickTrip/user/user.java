package org.generation.QuickTrip.user;

public class user {
	private int id;
    private String userName;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
	private String phone;
    private boolean admin;
    private String date;
    @SuppressWarnings("unused")
	private static int total=0;
    
	public user(String userName, String email, String password, String firstName, String lastName, String phone,
			boolean admin, String date) {
		super();
		total ++; 
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.admin = admin;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", admin=" + admin
				+ ", date=" + date + "]";
	}
    
    
}
