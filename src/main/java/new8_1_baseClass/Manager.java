package new8_1_baseClass;

public class Manager extends BaseEmployee {

    private int stuffNumber;

    public Manager(String name, int age, int dailySalary, int stuffNumber) {
        super(name, age, dailySalary);
        this.stuffNumber = stuffNumber;
    }

    public int getStuffNumber() {
        return stuffNumber;
    }


      public String tripleTrouble(String one, String two, String three) {
    String result = "";
    for (int i = 0; i < one.length(); i++) {
      result += one.charAt(i);
      result += two.charAt(i);
      result += three.charAt(i);
    }
    return result;

  }





}



