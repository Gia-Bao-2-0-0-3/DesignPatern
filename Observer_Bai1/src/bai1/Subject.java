package bai1;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 11, 2025
 * @version: 1.0
 */
interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}