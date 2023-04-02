package beginnerHomeworks.homework5;

public class Task3 {
    public static void main(String[] args) {

        for (int i = 9; i >= 0; i--) {

             //Левая часть треугольника
            for (int j = 9; j > i; j--){
                System.out.print(" " + " "); //пробелы
            }

            for (int k = 0; k < i; k++){
                System.out.print(i-k + " ");
            }

            //Правая часть треугольника
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = 10; j > i; j--) {
                System.out.print(" "); //пробелы
            }

            System.out.println();
        }
    }
}