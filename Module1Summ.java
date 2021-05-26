package by.module1.main;
public class Module1Summ {
    /* Найти сумму квадратов первых 100 чисел */
    public static void main(String args[]){
        int i,j;
        int sum = 0;
        for(i = 1;i<=100; i++){
           j = i*i;
            sum  = sum +j;
        }
     
        System.out.println(sum);

    }
}
