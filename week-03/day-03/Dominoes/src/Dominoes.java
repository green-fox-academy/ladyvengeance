import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println(dominoes);
    System.out.println(sortDominoes(dominoes));
  }

  static List<Domino> sortDominoes(List<Domino> unsorted) {
    List<Domino> sortDominoes = new ArrayList<>();
    sortDominoes.add(unsorted.get(0));

    for (int i = 0; sortDominoes.size() != unsorted.size(); i++) {
      for (int j = 0; j < unsorted.size(); j++) {
        if (sortDominoes.get(i).getValues()[1] == unsorted.get(j).getValues()[0]) {
          sortDominoes.add(unsorted.get(j));
        }
      }
    }
    return sortDominoes;
  }
  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}