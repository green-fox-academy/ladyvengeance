import java.util.stream.Collectors;

public class Exercise09 {
  public static void main(String[] args) {
//    Write a Stream Expression to convert a char array to a string!
    char[] myArray = {'a', 'b', 'c'};

    myArray.toString();
    System.out.println(myArray);

    String charArrayToString = new String(myArray).chars()
        .mapToObj(c -> Character.toString((char) c))
        .collect(Collectors.joining());

    System.out.println(charArrayToString);
  }
}
