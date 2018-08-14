import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Logs {
  public static void main(String[] args) {

    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.

    System.out.println(uniqueIP("Logs.txt"));
  }
  static String[] uniqueIP (String input) {
    Path path = Paths.get(input);

  }
}
