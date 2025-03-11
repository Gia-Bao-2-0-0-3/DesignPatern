package bai1;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 11, 2025
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Class class1 = new Class("1","Lop 1");
        
        Student student1 = new Student("1","Hoc sinh 1");
        Student student2 = new Student("2","Hoc sinh 2");
        Student student3 = new Student("3","Hoc sinh 3");

        class1.attach(student1);
        class1.attach(student2);
        class1.attach(student3);
        
        class1.notifyObservers();

    
    }
}