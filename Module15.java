package by.module1.main;
public class Module15 {
    /* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах ,
     вывести данное значение длительности в часах . минутах и секундах: HH ч MM минSS сек  */
    public static void main (String[] args){

        int x = 4785;

        int hours = (x / 3600);

        int temp = x - (hours * 3600);
        int minutes = temp / 60;

        int seconds = temp - (minutes * 60);

        System.out.println("Исходная длительность в секундах: " + x);
        System.out.println(hours + " ч. " + minutes + " мин. " + seconds + " c.");
        System.out.println();
    }
    
}
