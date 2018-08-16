public class StringsAgain {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.

    System.out.println(stringsNoX("All the x'es have been removed from this sentence."));
  }
  public static String stringsNoX (String input) {
    if (input.length() == 0) {
      return input;
    } else {
      String first = input.startsWith("x") ? "" : input.substring(0, 1);
      return first + stringsNoX(input.substring(1));
    }
  }
}
