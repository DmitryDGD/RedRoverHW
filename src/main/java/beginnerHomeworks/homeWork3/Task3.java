package beginnerHomeworks.homeWork3;

public class Task3 {
    public static void main(String[] args) {

        int num1 = 55;

        if (num1 > 10) {
            System.out.println("больше 10");
        }
        if (num1 < 100) {
            System.out.println("меньше 100");
        }
        if ((num1 / 2) > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if ((5 <= num1) && (num1 <= 40)) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else System.out.println("значение переменной меньше 5 или больше 40");

    }
}
