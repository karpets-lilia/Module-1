package by.module1.main;
public class Module14 {
    /*Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной
    * и целой частях )ю Поменять местами дробную и целую части числа и вывести полученное
    * значение числа */
    public static void main(String args[]){
        double R = 145.523;
        double result = (R*1000) % 1000 + (int) R/1000.0;
        System.out.println("полученное значение ="+ result);
    }
}
