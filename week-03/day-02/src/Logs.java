import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP addresses.
    // Write a function that returns the GET / POST request ratio.
    String filename = "Logs.txt";

    System.out.println(getUniqueIPs(filename));
    System.out.println(getGetPostRatio(filename));
  }

  private static List<String> getUniqueIPs (String filename) {
    List<String> allIPs = getallIPs(filename);
    List<String> uniqueIPs = new ArrayList<>();

    for (String ip : allIPs) {
      if (!uniqueIPs.contains(ip)) {
        uniqueIPs.add(ip);
      }
    }
    return uniqueIPs;
  }

  private static List<String> getallIPs (String filename) {
    List<String> content = getContent(filename);
    List<String> allIPs = new ArrayList<>();


    for (String line : content) {
      Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{2}\\.\\d{2}");
      Matcher matcher = pattern.matcher(line);
      while (matcher.find()) {
        allIPs.add(matcher.group());
      }
    }
    return allIPs;
  }

  private static double getGetPostRatio (String filename) {
    List<String> content = getContent(filename);
    double getCounter = 0.;
    double postCounter = 0.;

    for (String line : content) {
      if (line.contains("GET")) {
        getCounter++;
      } else if (line.contains("POST")) {
        postCounter++;
      }
    }
    double ratio = getCounter / postCounter;
    return ratio;
  }

  private static List<String> getContent(String filename) {
    Path path = Paths.get(filename);
    List<String> content = new ArrayList<>();

    try {
      content = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return content;
  }
}