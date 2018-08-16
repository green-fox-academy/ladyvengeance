public class Strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    System.out.println(strings("There is one x and one y in this sentence."));
  }
  public static String strings (String input) {
    boolean noX = input.contains("x");
    if (noX == false) {
      return input;
    } else {
      return input.replace("x", "y");
    }
  }
}
