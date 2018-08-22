public class Student implements Cloneable {
  public String name;
  private int age;
  public String gender;
  public String previousOrganization;
  private int skippedDays;

  public Student (){
    previousOrganization = "The School of Life";
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
  }

  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public int skipDays(int numberOfDays) {
    return skippedDays += numberOfDays;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}