import java.util.ArrayList;

public class Garden {
  ArrayList<Plant> plants = new ArrayList<>();

  public void addPlant(Plant newPlant){
    plants.add(newPlant);
  }

  public void checkStatus() {
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i) instanceof Flower && plants.get(i).needsWater() == true) {
        System.out.println("The " + plants.get(i).toString() + " Flower needs water");
      } else if (plants.get(i) instanceof Flower && plants.get(i).needsWater() == false) {
        System.out.println("The " + plants.get(i).toString() + " Flower doesn't need water");
      } else if (plants.get(i) instanceof Tree && plants.get(i).needsWater() == true) {
        System.out.println("The " + plants.get(i).toString() + " Tree needs water");
      } else if (plants.get(i) instanceof Tree && plants.get(i).needsWater() == false) {
        System.out.println("The " + plants.get(i).toString() + " Tree doesn't need water");
      }
    }
  }

  public void waterGarden(int amountOfWater) {
    int watered = 0;
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).needsWater() == false) {
        watered ++;
      }
      plants.get(i).waterPlant(amountOfWater / (plants.size() - watered));
    }
  }
}
