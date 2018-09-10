import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise07 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the frequency of characters in a given string!
    String whatever = "How many letters in a string?";

    Map<Character, Integer> stringCounter = new HashMap<>();
    for (char ch : whatever.toLowerCase().toCharArray())
      stringCounter.put(ch, stringCounter.getOrDefault(ch, 0) + 1);
    System.out.println(stringCounter);

    Map<Character, Integer> stringCounterWithStream =
        whatever.chars()
            .mapToObj(c -> (char)c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));
    System.out.println(stringCounterWithStream);
  }
}
