public class StringsAgainAndAgain {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".

    System.out.println(stringsAndStars("This is one of those days."));
  }
  public static String stringsAndStars (String input) {
    if (input.isEmpty()) {
      return input;
    } else {
      String fromSecond = input.substring(1);
      return input.charAt(0) + "*" + stringsAndStars(fromSecond);
    }
  }
}
