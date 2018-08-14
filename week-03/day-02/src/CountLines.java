import java.io.FileReader;
import java.io.LineNumberReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    numOfLines("my-file.txt");

  }
  public static void numOfLines (String x) {
    Path path = Paths.get(x);
    try {
      LineNumberReader reader  = new LineNumberReader(new FileReader(x));
      int counter = 0;
      String lineRead = "";
      while ((lineRead = reader.readLine()) != null) {}

      counter = reader.getLineNumber();
      reader.close();
      System.out.println(counter);

    } catch (Exception e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}
