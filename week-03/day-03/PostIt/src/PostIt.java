public class PostIt {

  public static void createPostIt(String a, String b, String c) {
    String backgroundColour;
    String text;
    String textColour;

    backgroundColour = a;
    text = b;
    textColour = c;
    System.out.println("This is a(n) " + backgroundColour + " post-it.");
    System.out.println("It says: " + text + " in " + textColour);
  }

  public static void main(String[] args) {
    createPostIt("orange", "Idea 1", "blue");
    createPostIt("pink", "Awesome", "black");
    createPostIt("yellow", "Superb!", "green");

  }
}
