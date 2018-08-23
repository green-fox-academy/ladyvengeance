import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String string1 = "reverse";
    String string2 = "reserve";

    System.out.println(isAnagram(string1, string2));
  }

  public static boolean isAnagram(String input1, String input2) {
    if (input1.length() != input2.length())
      return false;

    input1.toLowerCase();
    input2.toLowerCase();

    char[] input1CharArr = input1.toCharArray();
    char[] input2CharArr = input2.toCharArray();
    Arrays.sort(input1CharArr);
    Arrays.sort(input2CharArr);

    return Arrays.equals(input1CharArr, input2CharArr);
  }
}
