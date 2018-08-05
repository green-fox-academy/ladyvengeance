import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type in the number of chickens the farmer has:");
    int chicken = scanner.nextInt();
    System.out.println("Please type in the number of pigs the farmer has:");
    int pig = scanner.nextInt();

    System.out.println("The farmer's animals have " + (chicken * 2 + pig * 4) + " legs altogether.");
  }
}
