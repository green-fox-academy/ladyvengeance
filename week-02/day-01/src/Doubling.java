import java.util.function.Function;

public class Doubling {
  public static void main(String[] args) {
    int baseNum = 123;

    System.out.println(doubling(baseNum));
   }
  public static int doubling(int x) {
    return x * 2;
  }
}