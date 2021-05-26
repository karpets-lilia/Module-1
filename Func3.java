package by.module1.main;

public class Func3 {
    /*Найдите значение функции : z = ((a=3)*b/2)+c  */
    public static void main(String args[]){
        double x = 30;
        double y = 90;

        double xRad = x * Math.PI/180.0;
        double yRad = y * Math.PI/180.0;

        double result = (Math.sin(xRad) + Math.cos(yRad))/(Math.cos(xRad) + Math.sin(yRad)) * Math.tan(xRad*yRad);
         System.out.println("Значение выражения = " + result);
    }
}
