package by.module1.main;

public class Module1ABC3 {
    /* Даны три точки A(x1,y1),B(x2,y2),C(x3,y3). Определить , будут ли
    * они расположены на одной прямой.  */
    public static void main(String args[]){
        double x1 = 1;
        double y1 = 1;
        double x2 = 2;
        double y2 = 2;
        double x3 = 3;
        double y3 = 3;

        if((x3 -x1)/(x2 - x1)==(y3-y1)/(y2-y1)){
            System.out.println("Точки A, B, C принадлежат одной прямой");
        }else {
            System.out.println("Точки A, B, C не принадлежат одной прямой");

        }
    }
}
