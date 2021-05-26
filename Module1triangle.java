package by.module1.main;
public class Module1triangle {
    /* Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник
    *  если да, то будет ли он прямоугольным  */
    public static void main (String[] args){
        int a = 30;
        int b = 50;
        int c = 100;
        if(a + b < 180) {
            System.out.println("треугольник существует");
        }else if((a == 90) || (b == 90) || (c == 90)){
            System.out.println("треугольник прямоугольный");
        }else {
            System.out.println("треугольник не существует");
        }
    }

}

