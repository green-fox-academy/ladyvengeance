import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in a whole number");
    int num = scanner.nextInt();

    for (int i = 0; i < num; i++) {
      System.out.print("%");
    }
    System.out.println();
    for (int j = 0; j < num - 2; j++) {
      for (int k = 0; k < num; k++) {
        if (k == 0 || k == num - 1) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int l = 0; l < num; l++) {
      System.out.print("%");
    }
  }
}
