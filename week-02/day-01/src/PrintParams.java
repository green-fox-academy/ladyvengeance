public class PrintParams {
  public static void main(String[] args) {
    printParams("second", "third");
  }
  public static void printParams(String ... x) {
    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i] + ", ");
    }
  }
}
