package bai1;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 11, 2025
 * @version: 1.0
 */
class Student implements Observer {
	private String id;
    private String name;

    public Student(String id,String name) {
    	this.id = id;
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " da nhan thong bao: " + message);
    }
}