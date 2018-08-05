import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type in a whole number");
    int n = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i > 1 && i < n && j > 1 && j < n) {
          if (i == j) {
            System.out.print("%");
          } else {
            System.out.print(" ");
          }
        } else {
          System.out.print("%");
        }
      }
      System.out.println();
    }
  }
}