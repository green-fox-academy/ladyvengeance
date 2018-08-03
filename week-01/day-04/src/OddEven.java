import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type a whole number");
    int userInput1 = scanner.nextInt();
    if (userInput1 % 2 == 0) {
      System.out.println("Even");
    }
    else {
      System.out.println("Odd");
    }
  }
}
