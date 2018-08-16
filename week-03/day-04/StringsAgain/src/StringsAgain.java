public class StringsAgain {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    System.out.println(stringsNoX("All the x'es have been removed from this sentence."));
  }
  public static String stringsNoX (String input) {
    boolean noX = input.contains("x");
    if (noX == false) {
      return input;
    } else {
      return input.;
    }
  }
}
