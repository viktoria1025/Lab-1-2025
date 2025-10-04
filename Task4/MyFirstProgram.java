class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.setFirstVal(i);            
                o.setSecondVal(j);     
                System.out.print(o.Metod());   
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
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
