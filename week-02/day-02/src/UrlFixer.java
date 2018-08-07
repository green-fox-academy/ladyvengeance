public class UrlFixer {
  public static void main(String... args) {
    String url = "https://www.reddit.com/r/nevertellmethebots";

    String urlFixed = url.replace("bots", "odds");

    System.out.println(urlFixed);
  }
}
