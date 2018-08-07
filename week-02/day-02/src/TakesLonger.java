public class TakesLonger {
  public static void main(String... args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    StringBuilder quoteFixed = new StringBuilder(quote);
    quoteFixed.insert(21,"always takes longer than ");

    System.out.println(quoteFixed);
  }
}
