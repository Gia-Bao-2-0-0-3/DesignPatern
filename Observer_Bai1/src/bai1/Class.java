package bai1;

import java.util.ArrayList;
import java.util.List;

/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 11, 2025
 * @version: 1.0
 */
class Class implements Subject {
    private List<Observer> observers;
    private String id;
    private String name;
    
	public Class(String id, String name) {
		this.id = id;
		this.name = name;
		this.observers = new ArrayList<>();
	}

    public Class() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Dong tien doan phi.");
        }
    }

  
}