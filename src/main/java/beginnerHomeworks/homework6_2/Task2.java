package beginnerHomeworks.homework6_2;

public class Task2 {
    public static void main(String[] args) {

        String str = "Перевыборы выбранного президента";
        int count = 0;

        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);

    }
}
