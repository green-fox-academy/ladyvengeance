import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type two whole numbers separated by spaces");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    scanner.close();

    if (a == b) {
      System.out.println("The two numbers are the same.");
    } else if (a > b) {
      System.out.println(a + " is the bigger number.");
    } else {
      System.out.println(b + " is the bigger number.");
    }
  }
}
