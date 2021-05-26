package by.module1.main;

public class Module1AB {
    /*  Заданы размеры A,B прямоугольного отверстия и размеры x,y,z кирпича.
    Определить , пройдет ли кирпич через отверстие. */
    public static void main(String args[]){
        double a = 10;
        double b = 20;
        double x = 30;
        double y = 30;
        double z = 3;

            if((a>=x && b>=y)||(a>=y && b>=x)|| (a>=x && b>=z)||(a>=z && b>=x)
            || (a>=z && b>=y)||(a>=y && b>=z)){
                System.out.println("кирпич влезет в прямоугольное отверстие");
            }else{
                System.out.println("кирпич не влезет в прямоугольное отверстие");
            }

        }
    }
