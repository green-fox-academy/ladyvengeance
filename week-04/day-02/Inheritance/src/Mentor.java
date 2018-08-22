public class Mentor {
  String name;
  int age;
  String gender;
  String level;

  public static void Mentor(String name, int age, String gender, String level) {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    level = "intermediate";
  }

  public static void introduce () {
    System.out.println("Hi, I'm " + name + ", a(n) " + age + "-year-old " + gender + " " + level + " mentor.");
  }

  public static void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
