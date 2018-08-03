public class PrintEven {
  public static void main(String[] args) {
    int a = 0;
    for (int i = 0; i < 501; i++) {
      if (a % 2 == 0) {
        System.out.println(a);
      }
      a += 1;
    }
  }
}