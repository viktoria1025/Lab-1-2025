import myfirstpackage.*;

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
