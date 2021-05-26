package by.module1.main;
public class Module1multiplication {
    /* Составить программу нахождению произведения квадратов первых 200 чисел*/
    public static void main(String args[]){
        int i,j;
        double multip = 1;
        for(i = 1; i<=200; i++){
            j = i*i;
            System.out.println("j= " + j);
            multip = multip * j ;
        }
        System.out.println("multip=" + multip);
    }
}


