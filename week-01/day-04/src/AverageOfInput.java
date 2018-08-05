import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type five whole numbers in a row separated by spaces");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();
    int e = scanner.nextInt();
    scanner.close();

    int sum = a + b + c + d + e;
    int average = (a + b + c + d + e)/5;

    System.out.println("The sum of these numbers is " + sum);
    System.out.println("The average of these numbers is " + average);
  }
}

