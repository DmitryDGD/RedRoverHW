package beginnerHomeworks.homework5;

public class Task2 {
    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {

            for (int k = 10; k > i; k--) {
                System.out.print(" " + " ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(j+9 + " ");
            }

            System.out.println();
        }
    }
}
