package beginnerHomeworks.homework6_1;

public class Task1 {
    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int summArray = 0;

        for (int i : array) {
            summArray += i;

        }

        System.out.println(summArray);

    }
}
