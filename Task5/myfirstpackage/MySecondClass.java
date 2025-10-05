package myfirstpackage;

public class MySecondClass {
    // Два приватных поля типа int
    private int FirstNum;
    private int SecondNum;
    
    // Конструктор
    public MySecondClass(int First, int Second) {
        this.FirstNum = First;
        this.SecondNum = Second;
    }
    
    // Метод для получения значения 1 поля
    public int GetFirstNum() {
        return FirstNum;
    }
    
    // Метод для модификации значения 1 поля
    public void SetFirstNum(int value) {
        this.FirstNum = value;
    }
    
    // Метод для получения значения 2 поля
    public int GetSecondNum() {
        return SecondNum;
    }
    
    // Метод для модификации значения 2 поля
    public void SetSecondNum(int value) {
        this.SecondNum = value;
    }
    
    // Метод реализующий умножение
    public int MetodMultiplication() {
        return FirstNum * SecondNum;
    }
}
