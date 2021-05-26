package by.module1.main;

import java.util.Scanner;

public class Module1Cicle {
    /* Напишите программу, где пользователь вводит любое целое положительное число.\
    * А программа суммирует все числа от 1 до введенного пользователем число. */
    public static void main(String args[]) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
