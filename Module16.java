package by.module1.main;
public class Module16 {
    /*  Для данной области составить линейную программу , которая печатает true,
    * если точка с координатами (x,y) принадлежит закрашенной области и false в противном случае*/
    public static void main(String args[]) {

        int x = 0;
        int y = 5;

        if ((x >= -2 && x <= 2 && y <= 4 && y >= 0) || (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
