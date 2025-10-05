class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.SetFirstNum(i);            
                o.SetSecondNum(j);     
                System.out.print(o.MetodMultiplication());   
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    // Два приватных поля типа int для хранения числовый значений
    private int FirstNum;
    private int SecondNum;
    
    // Конструктор - инициализирует поля класса переданными значениями
    public MySecondClass(int First, int Second) {
        this.FirstNum = First;
        this.SecondNum = Second;
    }
    
    // Метод для получения значения 1 приватного поля, используется для чтения значений извне класса
    public int GetFirstNum() {
        return FirstNum;
    }
    
    // Метод, использующийся для безопасного изменения значения 1 поля
    public void SetFirstNum(int value) {
        this.FirstNum = value;
    }
    
    // Метод для получения значения 2 приватного поля, используется для чтения значений извне класса
    public int GetSecondNum() {
        return SecondNum;
    }
    
    // Метод, использующийся для безопасного изменения значения 2 поля
    public void SetSecondNum(int value) {
        this.SecondNum = value;
    }
    
    // Метод реализующий умножение чисел
    public int MetodMultiplication() {
        return FirstNum * SecondNum;
    }
}
