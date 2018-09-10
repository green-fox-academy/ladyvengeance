import java.util.ArrayList;
import java.util.Arrays;

public class Exercise04 {
  public static void main(String[] args) {
//    Write a Stream Expression to find which number squared value is more than 20 from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    for (int num : numbers) {
      if (num * num > 20) {
        System.out.print(num + " ");
      }
    }

    System.out.println();

    numbers.stream()
        .filter(n -> n * n > 20)
        .forEach(n -> System.out.format("%s ", n, numbers));
  }
}
