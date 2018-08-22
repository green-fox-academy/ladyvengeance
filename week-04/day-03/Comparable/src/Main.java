import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    Collections.sort(dominoes);
    System.out.println(dominoes);

    List<Thing> things = new ArrayList<>();
    things.add(new Thing("thing1"));
    things.add(new Thing("thing2"));
    things.add(new Thing("thing3"));
    things.add(new Thing("thing4"));
    things.add(new Thing("thing5"));
    things.add(new Thing("thing6"));
    things.add(new Thing("thing7"));
    things.add(new Thing("thing8"));

    Collections.sort(things);
    System.out.println(things);
  }
}
