public class DivideByZero {
  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    divByZero(2);

  }
  public static int divByZero (int a) {
    try {
      a = 10 / a;
      System.out.println(a);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
    return a;
  }
}
