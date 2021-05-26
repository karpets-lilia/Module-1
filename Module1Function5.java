package by.module1.main;

public class Module1Function5 {
    /* Вычислить значение функции F(x) {x^2 - 3x+9, если x<=3, 1/(x^3 +6), если x>3. */
    public static void main(String args[]){
        double x = 2;

        if(x<=3){
            System.out.println( Math.pow(x,2) - (3 * x) + 9);
        }else if(x>3){
            System.out.println(1 / (Math.pow(x,3) + 6));
        }
    }
}
