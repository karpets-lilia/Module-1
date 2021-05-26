package by.module1.main;

public class Func2 {
    /*Вычислить значение выражения по формуле ((sinx+cosx)/(cosx+sinx)/tgxy */
    public static void main(String args[]){
        double a = 2;
        double b = 3.2;
        double c = 5;

        double z = ((b + Math.sqrt(Math.pow(b,2) + 4 * a * c))/2*a) - (Math.pow(a,3)*c)+Math.pow(b,-2);
        System.out.println("При значениях a =" + a + "b = " + b + "c =" +c +"значение выражения  =" + z);

    }
}
