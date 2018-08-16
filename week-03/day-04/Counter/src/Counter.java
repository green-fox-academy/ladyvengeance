public class Counter {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and counts down from n.
    System.out.println(countFromN(5));
  }
  public static int countFromN (int a) {
    if (a == 0) {
      return 0;
    } else {
        return (countFromN(a-1) + a);
    }
  }
}
