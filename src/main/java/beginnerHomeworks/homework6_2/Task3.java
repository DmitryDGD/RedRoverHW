package beginnerHomeworks.homework6_2;

public class Task3 {
    public static void main(String[] args) {

        String str = "Посмотрите как Рите нравится ритм";

        int index = str.indexOf("рит");

        while (index != -1) {
            System.out.println(index);
            index = str.toLowerCase().indexOf("рит", index + 1);
        }
    }

}

