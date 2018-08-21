import java.util.ArrayList;

public class Garden {
  ArrayList<Plant> plants = new ArrayList<>();

  public void checkStatus() {
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i) instanceof Flower && plants.get(i).needsWater() == true) {
        System.out.println("The " + plants.get(i).toString() + " Flower needs water");
      } else if (plants.get(i) instanceof Tree && plants.get(i).needsWater() == true) {
        System.out.println("The " + plants.get(i).toString() + " Tree needs water");
      }
    }
  }
}
