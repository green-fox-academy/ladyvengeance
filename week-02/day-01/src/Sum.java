import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type in a number");
    int userinput = scanner.nextInt();

    System.out.println(sum(userinput));
  }
  public static int sum(int i) {
    int temp = 0;
    for (int j = 0; j <= i ; j++) {
      temp = temp + j;
    } return temp;
  }
}
