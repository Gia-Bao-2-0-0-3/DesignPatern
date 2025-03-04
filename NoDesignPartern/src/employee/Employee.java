package employee;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 4, 2025
 * @version: 1.0
 */
public class Employee {
	private String id;
	private String role;
	
	void showTask() {
		switch (role) {
		case "Doi truong":
			System.out.println("Di tuan, gan viec cho nhan vien");
			break;
		case "Giam doc":
			System.out.println("Quyet dinh chien luoc, chi dao");
			break;
		case "Nhan vien":
			System.out.println("Pha ca phe");
			break;
		}
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", role=" + role + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String role) {
		super();
		this.id = id;
		this.role = role;
	}
	
}
