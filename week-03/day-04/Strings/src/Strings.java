public class Strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    System.out.println(stringsXToY("There is xxxx and one y in this sentence."));
  }
  public static String stringsXToY (String input) {
    boolean noX = input.contains("x");
    if (noX == false) {
      return input;
    } else {
      return stringsXToY(input.replace("x", "y"));
    }
  }
}
