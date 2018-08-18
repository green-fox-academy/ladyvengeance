public class Mentor {
  String name = new String();
  int age;
  String gender = new String();
  String level = new String();

  public static void introduce () {
    System.out.println("Hi, I'm " + name + ", a(n) " + age + "-year-old " + gender + " " + level + " mentor.");
  }

  public static void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public static void Mentor(name, age, gender, level) {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    level = "intermediate";
  }
}
