import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise08 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the frequency of numbers in the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    Map<Integer, Integer> numCounter = new HashMap<>();
    for (int n : numbers)
      numCounter.put(n, numCounter.getOrDefault(n, 0) + 1);
    System.out.println(numCounter);

    Map<Integer, Long> numCounterWithStream =
        numbers.stream()
            .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
    System.out.println(numCounterWithStream);
  }
}
