package beginnerHomeworks.homework6_1;

public class Task2 {
    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array[0];


        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);

    }
}
