package beginnerHomeworks;

public class Homework2 {

    public static void main(String[] args) {
        int num1 = 22;
        int num2 = 3;


        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println("Остаток от деления num1 на num2= " + num1 % num2);

        if (num1 % 2 == 0) {
            System.out.println("Переменная num1 чётная");
        } else System.out.println("Переменная num1 нечётная");

        if (num2 % 2 == 0) {
            System.out.println("Переменная num2 чётная");
        } else System.out.println("Переменная num2 нечётная");

        System.out.println("UTF-16 символ: " + '\u263A');

    }
}






