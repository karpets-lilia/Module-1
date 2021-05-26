package by.module1.main;

public class Module1MaxMin2 {

        /* Найти max{min(a,b), min(c,d)} вариант решения 2 */
        public static void main(String args[]) {
            int a = 0;
            int b = 3;
            int c = 2;
            int d = 1;
            if (a < b) {
                if (c < d) {
                    if (a > c) {
                        System.out.println(a);
                    } else {
                        System.out.println(c);
                    }
                } else {
                    if (a > d) {
                        System.out.println(a);
                    } else {
                        System.out.println(d);
                    }
                }
            } else {
                if (c < d) {
                    if (b > c) {
                        System.out.println(b);
                    } else {
                        System.out.println(c);
                    }
                } else {
                    if (b > d) {
                        System.out.println(b);
                    } else {
                        System.out.println(d);
                    }
                }
            }
        }
    }
