package employee;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 4, 2025
 * @version: 1.0
 */
public class Main {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId("1");
		e.setRole("Doi truong");
		System.out.println(e.getRole());
		e.showTask();
		System.out.println("\n");
		
		Employee e1 = new Employee();
		e1.setId("2");
		e1.setRole("Giam doc");
		System.out.println(e1.getRole());
		e1.showTask();
		System.out.println("\n");
		
		Employee e2 = new Employee();
		e2.setId("3");
		e2.setRole("Nhan vien");
		System.out.println(e2.getRole());
		e2.showTask();
	
	}
}
