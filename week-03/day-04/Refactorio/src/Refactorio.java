public class Refactorio {
  public static void main(String[] args) {
    // Create a recursive function called `refactorio`
    // that returns it's input's factorial

    System.out.println(refactorio(5));
  }
  public static int refactorio(int a) {
    if (a == 1) {
      return a;
    } else {
      return a * refactorio(a - 1);
    }
  }
}
