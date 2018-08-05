import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type in a whole number");
    int rows = scanner.nextInt();
    String star = "*";

    for(int i = 1; i <= rows; i++) {
      System.out.println(star);
      star += "*";
    }
  }
}
