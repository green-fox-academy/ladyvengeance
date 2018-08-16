public class BunniesAgain {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    System.out.println(bunzEarz(9));
  }
  public static int bunzEarz (int a) {
    int sum1 = 0;
    int sum2 = 0;

    if (a == 1) {
      return 2;
    } else if (a == 2) {
      sum1 = 5;
    } else if (a % 2 == 0) {
      sum1 += 3 + bunzEarz( a - 1);
    } else if (a % 2 == 1) {
      sum2 += 2 + bunzEarz(a - 1);
    }
    return sum1 + sum2;
  }
}
