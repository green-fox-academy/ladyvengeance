import java.util.Scanner;
import java.text.DecimalFormat;

public class MileToKmConverter {
  private static DecimalFormat df2 = new DecimalFormat(".##");
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type a whole number as a distance in km");
    int userInput1 = scanner.nextInt();
    double kmToMile = userInput1 * 0.621371;
    if (userInput1 == 1) {
      System.out.println(userInput1 + " km is " + String.format(java.util.Locale.US,"%.2f", kmToMile) + " miles.");
    }
    else {
      System.out.println(userInput1 + " km are " + String.format(java.util.Locale.US,"%.2f",kmToMile) + " miles.");
    }


  }
}
