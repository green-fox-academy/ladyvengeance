import java.util.ArrayList;
import java.util.Arrays;

public class Exercise02 {
  public static void main(String[] args) {
//    Write a Stream Expression to get the average value of the odd numbers from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    int sum = 0;
    int counter = 0;
    for (int num : numbers) {
      if (num % 2 != 0) {
        sum += num;
        counter++;
      }
    }
    double average = (double)sum / counter;

    System.out.println(average);

    numbers.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n)
        .average()
        .ifPresent(System.out::println);
  }
}