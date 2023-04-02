package beginnerHomeworks.homeWorks7;

import java.util.Objects;

public class Person {
    String name;
    int age;
    String gender;

public Person(String name, int age, String gender) {
        this.gender = gender;
         this.name = name;
         this.age = age;
         this.gender = gender;
    }

    public String getName() {
        if (Objects.equals(gender, "male")) {
            return ("Mr. +" + name);
        } else return ("Mrs. " + name);

    }



    public static void main(String[] args) {
        Person man1 = new Person("Jack", 11, "male");
        System.out.println(man1.getName());
    }

}
