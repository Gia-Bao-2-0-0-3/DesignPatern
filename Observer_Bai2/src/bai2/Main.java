package bai2;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 11, 2025
 * @version: 1.0
 */
public class Main {
	public static void main(String[] args) {
		QuanCafe quanCafe = new QuanCafe("Bao Cafe");
		Table table1 = new Table("ban 1");
		Table table2 = new Table("ban 2");
		Table table3 = new Table("ban 3");
		Table table4 = new Table("ban 4");
		Table table5 = new Table("ban 5");
		Table table6 = new Table("ban 6");
		Table table7 = new Table("ban 7");
		Table table8 = new Table("ban 8");
		Table table9 = new Table("ban 9");
		Table table10 = new Table("ban 10");
		
        Drink drink1 = new Drink("Cafe", 20000);
        Drink drink2 = new Drink("Tra", 10000);
        Drink drink3 = new Drink("Nuoc ep", 15000);
        Drink drink4 = new Drink("Sua dau nanh", 12000);
        Drink drink5 = new Drink("Sinh to", 25000);
        
        table1.add(drink1);
        table2.add(drink2);
        table3.add(drink3);
        table4.add(drink4);
        table5.add(drink5);
        table6.add(drink1);
        table7.add(drink2);
        table8.add(drink3);
        table9.add(drink4);
        table10.add(drink5);
        
        quanCafe.add(table1);
        quanCafe.add(table2);
        quanCafe.add(table3);
        quanCafe.add(table4);
        quanCafe.add(table5);
        quanCafe.add(table6);
        quanCafe.add(table7);
        quanCafe.add(table8);
        quanCafe.add(table9);
        quanCafe.add(table10);
        
        System.out.println("Tong tien cua quan cafe: " + quanCafe.totalPrice());
		
		
		
		
		
		
	}

}
