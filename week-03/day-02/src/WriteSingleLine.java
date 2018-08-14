import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"

    addNewLine("my-file.txt");
  }
  public static void addNewLine (String x) {

    try {
      Writer writer = new BufferedWriter(new OutputStreamWriter(
          new FileOutputStream(x, true), "UTF-8"));
      writer.append("\nDeszpoth Csilla");
      writer.close();
    } catch (Exception e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}