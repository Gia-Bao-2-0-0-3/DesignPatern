package bai2;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 11, 2025
 * @version: 1.0
 */
public class Drink implements Composite{
	private String name;
	private double price;
	
	public Drink(String name, double price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public double totalPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
