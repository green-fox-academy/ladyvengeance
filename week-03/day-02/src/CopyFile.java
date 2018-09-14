import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to another
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

      String origin = "copyFrom.txt";
      String destination = "copyTo.txt";
      System.out.println(copyTo(origin, destination));
    }
    static boolean copyTo (String input1, String input2) {
      Path input1Path = Paths.get(input1);
      Path input2Path = Paths.get(input2);

      try {
        List<String> content = Files.readAllLines(input1Path);
        Files.write(input2Path, content);
        return true;
      } catch (IOException e) {
        return false;
      }

    }
}
