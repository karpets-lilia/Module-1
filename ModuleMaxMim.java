package by.module1.main;
public class ModuleMaxMim {
    /* Найти max{min(a,b), min(c,d)} */
    public static void main(String args[]) {
        int a = 0;
        int b = 3;
        int c = 2;
        int d = 1;
        int x = Math.min(a,b);
        int y = Math.min(c,d);
        System.out.println(Math.max(x,y));
        }
    }
