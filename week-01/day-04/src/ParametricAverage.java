import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter first number");
    int num1 = scanner.nextInt();
    System.out.println("Please enter second number");
    int num2 = scanner.nextInt();
    System.out.println("Please enter third number");
    int num3 = scanner.nextInt();
    System.out.println("Please enter fourth number");
    int num4 = scanner.nextInt();
    System.out.println("Please enter fifth number");
    int num5 = scanner.nextInt();
    System.out.println("Please enter sixth number");
    int num6 = scanner.nextInt();

    int sum = num1 + num2 + num3 + num4 + num5 + num6;
    System.out.println("The sum of these numbers is " + sum + ".");
    System.out.println(("The average of these numbers is " + ((double)sum) / 6) + ".");
  }
}
