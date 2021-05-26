package by.module1.main;
import java.util.ArrayList;
import java.util.Scanner;
/* Даны 2 числа. Определить цифры,
 входящие в запись как первого так и второго числа*/
public class Module1Number8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = in.nextInt();
        System.out.println("Введите b: ");
        int b = in.nextInt();
        System.out.println("Цифры которые входят в число a: " + numberEnter(a));
        System.out.println("Цифры которые входят в число b: " + numberEnter(b));
    }
    public static ArrayList numberEnter(int a){
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(a > 0){
            int i = 0;
            array.add(i, a % 10);
            a = a / 10;
            i++;
        }
        return array;
    }
}