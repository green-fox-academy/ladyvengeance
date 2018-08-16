public class Counter {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and counts down from n.
    System.out.println(countFromNum(5));
  }
  public static int countFromNum (int a) {
    if (a == 1) {
      return 1;
    } else {
      System.out.print(a + " ");
      return countFromNum(a-1);
    }
  }
}
