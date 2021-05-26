package by.module1.main;

public class Module1Function2 {
    /* Вычислить значение функции на отрезке [a,b] с шагом h. */
    public static void main(String args[]){
        int a = 2;
        int b = 3;
        double h = 0.5;
        double y, x;
        for(x=a; x < b; x+=h){
            System.out.println("x = " + x + ",");
            if(x>2){
                y = x *h;
               System.out.println("y ="+  y);
            }else if(x<=2){
                y = -x *h;
                System.out.println("y = "+ y);
            }
        }
    }
}
