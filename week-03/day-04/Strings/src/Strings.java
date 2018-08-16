public class Strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    char from = 'x';
    char to =  'y';

    System.out.println(stringsXToY("There is xxxx and one y in this sentence.", from, to));
  }
  public static String stringsXToY (String input, char from, char to) {

    if (input.length() == 0) {
      return input;
    } else {
      char first = from == input.charAt(0) ? to : input.charAt(0);
      return first + stringsXToY(input.substring(1), from, to);
    }
  }
}
