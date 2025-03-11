package bai2;

import java.util.ArrayList;
import java.util.List;

/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 11, 2025
 * @version: 1.0
 */
public class QuanCafe implements Composite{
	private String name;
	List<Composite> list;
	
	public QuanCafe(String name) {
		this.name = name;
		this.list = new ArrayList<Composite>();
	}
	@Override
	public double totalPrice() {
		
		double total = 0;
		for (Composite composite : list) {
			total += composite.totalPrice();
		}
		return total;
	}
	
	public void add(Composite composite) {
		list.add(composite);
	}

}
