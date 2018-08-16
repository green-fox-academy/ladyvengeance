public class Bunnies {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

    System.out.println(bunnyEars(8));
  }
  public static int bunnyEars (int a) {
    if (a == 1) {
      return 2;
    } else {
      return 1 + 1 + bunnyEars(a - 1);
    }
  }
}
