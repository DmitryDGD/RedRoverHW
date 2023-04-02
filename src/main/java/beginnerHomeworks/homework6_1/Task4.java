package beginnerHomeworks.homework6_1;

public class Task4 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = 0;

        for (int i : array) {
            result += i;
        }

        System.out.println(result / array.length);

    }
}
