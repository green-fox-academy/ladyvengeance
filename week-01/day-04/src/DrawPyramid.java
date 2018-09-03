import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in a whole number");
    int n = scanner.nextInt();

    String asterisk = "*";
    for (int i = 1; i <= n; i++) {
      for (int j = n - 1; j >= i ; j--) {
        System.out.print(" ");
      }
      System.out.println(asterisk);
      asterisk += "**";

//      FANCY SOLUTION
//      No need for "asterisk", instead, after the forJ loop (still inside the forI loop) put in a forK loop as below.
//      for (int k = 1; k <= 2 * i - 1; k++) {
//        System.out.print("*");
//      }
//      System.out.println("");
    }
  }
}
