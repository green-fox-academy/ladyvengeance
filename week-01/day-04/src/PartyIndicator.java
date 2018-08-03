import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type the number of girls coming to Dave's party on Friday");
    int userInput1 = scanner.nextInt();
    System.out.println("Please type the number of boys coming to Dave's party on Friday");
    int userInput2 = scanner.nextInt();
    if (userInput1 == 0) {
      System.out.println("Sausage party");
    } else if (userInput1 == userInput2 && userInput1 + userInput2 >= 20) {
      System.out.println("The party is excellent!");
    } else if (userInput1 + userInput2 >= 20 && userInput1 != userInput2) {
      System.out.println("Quite cool party!");
    } else if (userInput1 + userInput2 < 20) {
      System.out.println("Average party...");
    }
  }
}
