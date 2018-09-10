import java.util.ArrayList;

public class Exercise10 {
  public static void main(String[] args) {
//    Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes, it's up to you how you name/create them! Write a Stream Expression to find the foxes with green color! Write a Stream Expression to find the foxes with green color and pallida type!

    Fox fox1 = new Fox("Floofy", "red fox", "red");
    Fox fox2 = new Fox("Poofy", "arctic fox", "white");
    Fox fox3 = new Fox("Gorgeous", "Bengal fox", "light grey");
    Fox fox4 = new Fox("Mignon", "corsac fox", "sand");
    Fox fox5 = new Fox("George", "culpeo", "greyish");
    Fox fox6 = new Fox("Easter Egg", "pallida", "green");

    ArrayList<Fox> foxes = new ArrayList<>();
    foxes.add(fox1);
    foxes.add(fox2);
    foxes.add(fox3);
    foxes.add(fox4);
    foxes.add(fox5);
    foxes.add(fox6);

    foxes.stream()
        .filter(fox -> fox.getType().equals("pallida") && fox.getColor().equals("green"))
        .forEach(System.out::println);
  }
}
