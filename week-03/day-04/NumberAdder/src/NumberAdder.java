public class NumberAdder {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    System.out.println(addNum(5));
  }
  public static int addNum (int a) {
    if (a == 1) {
      return 1;
    } else {
      return (addNum(a-1) + a);
    }
  }
}

