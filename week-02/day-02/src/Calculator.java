import com.sun.jmx.remote.internal.ArrayQueue;

import java.lang.reflect.Array;
import java.util.*;

public class Calculator {
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type in the operation type and two whole numbers. Use spaces to separate the elements.");

    String userinput = scanner.next();

    List<String> userinList = new ArrayList<String>(Arrays.asList(userinput.split(" "));

    System.out.println(calculate(userinList));

    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
  }
  public static String calculate(ArrayList<String> input) {
    if (input.[0] == +) {
      input[1]+input[2];
    } else if (input[0] == -)
  }
}