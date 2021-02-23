package hw1;

public class hw1 {
    public static void main(String[] args) {

        System.out.println (myCalculate(18.5f, 17.56f, 33.56f ,11.00f));

        System.out.println( task10and20 (10, 20));

        isPositiveOrNegative( -30);

        greetings("Антарктида" );
    }

    public static float myCalculate(float a, float b, float c, float d) {
        return a * (b + (c/ d));
    }

    public static boolean task10and20(int x1, int x2) {
        if (x1 + x2 <= 10){
            return false;}
        else if (x1 + x2 >= 20){
            return false;}
        else {
            return true;}
    }

    public static void isPositiveOrNegative(int x){
        if (x >= 0){
            System.out.println("Введенное число положительное");
        } else {
            System.out.println("Введенное число отрицательное");
        }
    }

    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }


}
