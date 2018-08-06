import java.util.Scanner;

public class Factorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type in a number and I will let you know its factorial");
    int userinput = scanner.nextInt();

    System.out.println(factorio(userinput));
  }
  public static int factorio(int x) {
    int temp = 1;
    for (int i = 1; i <= x ; i++) {
      temp = temp * i;
    } return temp;
  }
}
