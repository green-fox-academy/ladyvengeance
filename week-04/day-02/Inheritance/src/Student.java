public class Student {
  String name = new String();
  int age;
  String gender = new String();
  String previousOrganization = new String();
  int skippedDays;

  public static void introduce() {
    System.out.println("Hi, I'm " + name + ", a(n) " + age + "-year-old " + gender + " from " + previousOrganization + "who skipped " + skippedDays + " days from the course already.");
  }

  public static void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public static void skipDays(int numberOfDays) {
    int skippedDays += numberOfDays;
  }

  public static void Student(name, age, gender, previousOrganization) {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    previousOrganization = "The School of Life";
    int skippedDays = 0;
  }
}
