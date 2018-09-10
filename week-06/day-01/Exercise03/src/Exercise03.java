import java.util.ArrayList;
import java.util.Arrays;

public class Exercise03 {
  public static void main(String[] args) {
//    Write a Stream Expression to get the squared value of the positive numbers from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    for (int num : numbers) {
      if (num > 0) {
        num *= num;
        System.out.print(num + " ");
      }
    }

    System.out.println();

    numbers.stream()
        .filter(n -> n > 0)
        .map(n -> n * n)
        .forEach(n -> System.out.format("%s ", n, numbers));
  }
}
