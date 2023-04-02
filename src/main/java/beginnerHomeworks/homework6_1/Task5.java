package beginnerHomeworks.homework6_1;

public class Task5 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result += array[i][j];
            }

        }
        System.out.println(result);

    }
}
