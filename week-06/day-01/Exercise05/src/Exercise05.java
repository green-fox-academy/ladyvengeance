import java.util.stream.Collectors;

public class Exercise05 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the uppercase characters in a string!
    String whatever = "Any uPperCase leTTers In herE?";

    String[] whateverAsArray = whatever.split("");
    for (String c : whateverAsArray) {
      if(Character.isUpperCase(c.charAt(0))) {
        System.out.print(c + " ");
      }
    }

    System.out.println();

    String onlyUps = whatever.chars()
        .filter(s -> Character.isUpperCase(s))
        .mapToObj(s -> Character.toString((char) s))
        .collect(Collectors.joining(" "));

//    Alternate version, was unable to add spaces after each character with the below
//    String onlyUps = whatever.chars()
//        .filter(s -> Character.isUpperCase(s))
//        .collect(StringBuilder::new,
//            StringBuilder::appendCodePoint,
//            StringBuilder::append)
//        .toString();
    System.out.println(onlyUps);
  }
}
