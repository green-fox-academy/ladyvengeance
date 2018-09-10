import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01 {
  public static void main(String[] args) {
//    Write a Stream Expression to get the even numbers from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    for (int num : numbers) {
      if (num % 2 == 0) {
        System.out.print(num + " ");
      }
    }

    System.out.println();

    numbers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(n -> System.out.format("%s ", n, numbers));
  }
}