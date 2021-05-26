package by.module1.main;
import java.util.Scanner;
/* Для каждого натурального числа в промежутке от m до n вывести все делители,
* кроме 1 и самого числа. m и n вводятся с клавиатуры. */
public class Module1MN7 {
    public static void main(String args[]) {
        System.out.println("Введите m: ");
        Scanner sc1 = new Scanner(System.in);
        int m = sc1.nextInt();
        System.out.println("Введите n: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();

        for(int i=m; i<=n; i++){
            System.out.println("делители числа " + i);
            for(int j=2; j<i;j++){
                if(i%j==0){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}



