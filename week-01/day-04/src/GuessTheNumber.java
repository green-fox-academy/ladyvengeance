import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    int maxNumber = 1000;
    Random random = new Random();
    int answer = random.nextInt(maxNumber);

    System.out.println("Type in a number between 1 and " + maxNumber + "to guess the one I have in mind");
    Scanner scanner = new Scanner(System.in);
    int guess;
    boolean win = false;

    while (win == false) {
      guess = scanner.nextInt();
      if (guess == answer) {
        win = true;
        System.out.println("You found the number: " + answer);
      } else if (guess < answer) {
        System.out.println("The stored number is higher. Try again!");
      } else {
        System.out.println("The stored number is lower. Try again!");
      }
    }
  }
}
