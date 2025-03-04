package employee;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 4, 2025
 * @version: 1.0
 */
public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setState(new GiamDoc());
		employee.showTask();
		System.out.println("\n");
		employee.setState(new NhanVien());
		employee.showTask();
		System.out.println("\n");
		employee.setState(new DoiTruong());
		employee.showTask();
	}
}
