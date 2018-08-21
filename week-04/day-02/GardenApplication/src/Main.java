import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Flower flower01 = new Flower("yellow");
    Flower flower02 = new Flower("blue");

    ArrayList<Plant> flowers = new ArrayList<>();
    flowers.add(flower01);
    flowers.add(flower02);

    Tree tree01 = new Tree("purple");
    Tree tree02 = new Tree("orange");

    ArrayList<Plant> trees = new ArrayList<>();
    trees.add(tree01);
    trees.add(tree02);

    for (int i = 0; i < flowers.size(); i++) {
      if (flowers.get(i).needsWater() == true) {
        System.out.println("The " + flowers.get(i).toString() + " Flower needs water");
      }
    }

    for (int i = 0; i < trees.size(); i++) {
      if (trees.get(i).needsWater() == true) {
        System.out.println("The " + trees.get(i).toString() + " Tree needs water");
      }
    }
//    System.out.println(flower01.needsWater());
    System.out.println(tree01.needsWater());
    System.out.println(flower01.getWaterLevel());
  }
}
