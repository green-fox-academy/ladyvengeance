public class SumDigit {
  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    System.out.println(sum(1549));
    System.out.println(sumToOneDigit(1549));
  }
  public static int sum (int a) {
    if (a < 10) {
      return a;
    } else {
      return sum(a / 10) + a % 10;
    }
  }
  //Sums even the digits of the result until it is only one digit
  public static int sumToOneDigit (int a) {
    if (a < 10) {
      return a;
    } else {
      return sumToOneDigit(sumToOneDigit(a / 10) + a % 10);
    }
  }
}
