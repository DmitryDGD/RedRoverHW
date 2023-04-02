package beginnerHomeworks.homework6_1;

public class Task7 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int result = 0;

        for (int[] i : array) {
            result += i.length;
        }

        System.out.println(result);
    }
}

