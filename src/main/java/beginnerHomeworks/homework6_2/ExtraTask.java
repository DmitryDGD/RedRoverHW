package beginnerHomeworks.homework6_2;

public class ExtraTask {
    public static void main(String[] args) {
        String[][] array = {{"Привет”, “всем”, “кто" }, {"изучает”, “язык”, “программирования" }, {"java" }};
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

           //     if (array[i][j].indexOf('е') == -1) { result += 1; }        // вариант 1
                if (!array[i][j].contains("е")) { result +=1; }             // вариант 2

            }
        }
        System.out.println(result);

    }
}


