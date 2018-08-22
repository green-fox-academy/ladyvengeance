public class Main {
  public static void main(String[] args) {
    Gnirts g = new Gnirts("string1");

    System.out.println(g.length());
    System.out.println(g.charAt(g.length() - 1) + "\n");

    Shifter s = new Shifter("lotzOfStringz", 3);

    System.out.println(s.length());
    System.out.println(s.charAt(5));
  }
}
