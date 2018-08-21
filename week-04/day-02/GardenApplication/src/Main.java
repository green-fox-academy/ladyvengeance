import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Plant flower01 = new Flower("yellow");
    Plant flower02 = new Flower("blue");

    ArrayList<Plant> flowers = new ArrayList<>();
    flowers.add(flower01);
    flowers.add(flower02);

    Plant tree01 = new Tree("purple");
    Plant tree02 = new Tree("orange");

    ArrayList<Plant> trees = new ArrayList<>();
    trees.add(tree01);
    trees.add(tree02);

    for (int i = 0; i < flowers.size(); i++) {

      if (flower01.needsWater() == true) {
        System.out.println("The " + flowers.get(i).toString() + " Flower needs water");
      }
    }
//    System.out.println(flower01.needsWater());
    System.out.println(tree01.needsWater());
    System.out.println(flower01.getWaterLevel());
  }
}
