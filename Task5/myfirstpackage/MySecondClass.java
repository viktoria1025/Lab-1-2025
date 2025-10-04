package myfirstpackage;

public class MySecondClass {
    // Два приватных поля типа int
    private int firstNum;
    private int secondNum;
    
    // Конструктор
    public MySecondClass(int first, int second) {
        this.firstNum = first;
        this.secondNum = second;
    }
    
    // Метод для получения значения 1 поля
    public int getFirstVal() {
        return firstNum;
    }
    
    // Метод для модификации значения 1 поля
    public void setFirstVal(int value) {
        this.firstNum = value;
    }
    
    // Метод для получения значения 2 поля
    public int getSecondVal() {
        return secondNum;
    }
    
    // Метод для модификации значения 2 поля
    public void setSecondVal(int value) {
        this.secondNum = value;
    }
    
    // Метод реализующий умножение
    public int Metod() {
        return firstNum * secondNum;
    }
}
