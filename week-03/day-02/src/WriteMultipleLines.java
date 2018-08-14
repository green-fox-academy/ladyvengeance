import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class WriteMultipleLines {
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // then it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number parameter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.

    addMoreLines("fileForMultipleLines","Apples are yum.", 5);

  } static void addMoreLines (String pathInput, String word, int number) {
    Path path = Paths.get(pathInput);

    ArrayList<String> stringList = new ArrayList<String>();
    for (int i = 0; i < number; i++) {
      stringList.add(word);
    }
    try {
      Files.write(path, stringList, StandardOpenOption.APPEND);
    } catch (IOException e) {
    }
  }
}
