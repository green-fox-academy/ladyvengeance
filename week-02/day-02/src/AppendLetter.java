import java.util.*;

public class AppendLetter{
  public static void main(String... args){
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

    System.out.println(appendA(far));
  }
  public static List<String> appendA(List<String> input) {

    for (int i = 0; i < input.size(); i++) {
      input.set(i, input.get(i).concat("a"));
    }
    return input;
  }
}