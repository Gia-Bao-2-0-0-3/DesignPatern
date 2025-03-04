package employee;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 4, 2025
 * @version: 1.0
 */
public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee(new GiamDoc());
		employee.performTask();
		System.out.println("-----------");
		employee.setTaskStrategy(new NhanVien());
		employee.performTask();
		System.out.println("-----------");
		employee.setTaskStrategy(new DoiTruong());
		employee.performTask();
	}
}
