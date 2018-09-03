import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in a whole number");
    int num = scanner.nextInt();

    if (num % 2 == 0) {
      for (int i = 1; i <= num / 2; i++) {
        for (int k = num / 2; k >= i; k--) {
          System.out.print(" ");
        }
        for (int l = 1; l <= 2 * i -1; l++) {
          System.out.print("*");
        }
      }
      for (int j = 1; j <= num / 2 ; j++) {
        for (int m = 1; m <= 2 * j - 1 ; m++) {
          System.out.print(" ");
        }
        for (int n = num / 2; n >= j ; n--) {
          System.out.print("*");
        }
      }
    }
//    else {
//      for (int i = 1; i <= num; i++) {
//        for (int j = num / 2; j >= i; j--) {
//          System.out.print(" ");
//        }
//        for (int k = 1; k <= 2 * i - 1; k++) {
//          System.out.println("*");
//        }
//        for (int l = num / 2; l >= i; l--) {
//          System.out.println("*");
//        }
//        for (int m = 1; m <= 2 * i -1; m++) {
//          System.out.println(" ");
//        }
//      }
//    }
  }
}
