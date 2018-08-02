import java.util.Scanner

public class MileToKmConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type a whole number as a distance in km");
    int userInput1 = scanner.nextInt();
    float kmToMile = userInput1 * 0.62137;
    System.out.println(userInput1 + " is " + kmToMile);

  }
}
