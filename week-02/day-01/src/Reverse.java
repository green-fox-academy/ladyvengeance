import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {
// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
    int[] aj = {3, 4, 5, 6, 7};

    int[] reverse = new int[aj.length];
    int lastIndex = aj.length - 1;
    int last = aj[lastIndex];
    for (int i = 0; i < aj.length; i++) {
      reverse[i] += last;
      lastIndex -= 1;
      if (lastIndex >= 0) {
        last = aj[lastIndex];
      }
    }

    System.out.println(Arrays.toString(reverse));
  }
}
