package employee;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 4, 2025
 * @version: 1.0
 */
public class Main {
	public static void main(String[] args) {
		TaskBasic task = new NhanVien();
		task.perform();
		System.out.println("-----------");
		TaskBasic task1 = new GiamDoc(task);
		task1.perform();
		System.out.println("-----------");
		TaskBasic task2 = new DoiTruong(task);
		task2.perform();
	
	}
}

