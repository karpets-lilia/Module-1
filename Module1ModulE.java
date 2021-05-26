package by.module1.main;
public class Module1ModulE {
    /* Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда,
     модуль которых больше или равен заданному e.Общий член ряда имеет вид
      an = 1/2^n + 1/3^n */
    public static void main(String args[]){
        double e = 3;
        int n = 1;
        double sum = 0;
        for(int i = 0;i <= n; i++){
            double a = (1/Math.pow(2,i))+(1/Math.pow(3,i));

            if(Math.abs(a)>=e){
                sum = sum + a;
            }
        }
        System.out.println(sum);
    }
}
