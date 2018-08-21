import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();

    Flower flower01 = new Flower("yellow");
    Flower flower02 = new Flower("blue");
    Tree tree01 = new Tree("purple");
    Tree tree02 = new Tree("orange");

    ArrayList<Plant> plants = new ArrayList<>();
    plants.add(flower01);
    plants.add(flower02);
    plants.add(tree01);
    plants.add(tree02);

    System.out.println("Watering with 40");

    for (int i = 0; i < plants.size(); i++) {
      plants.get(i).waterPlant(40);
    }
    System.out.println(garden.checkStatus());

    /*for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i) instanceof Flower && plants.get(i).needsWater() == true) {
        System.out.println("The " + plants.get(i).toString() + " Flower needs water");
      } else if (plants.get(i) instanceof Tree && plants.get(i).needsWater() == true) {
        System.out.println("The " + plants.get(i).toString() + " Tree needs water");
      }
    }*/

    System.out.println("Watering with 70");

    for (int i = 0; i < plants.size(); i++) {
      plants.get(i).waterPlant(70);
    }
/*
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i) instanceof Flower && plants.get(i).needsWater() == true) {
        System.out.println("The " + plants.get(i).toString() + " Flower needs water");
      } else if (plants.get(i) instanceof Tree && plants.get(i).needsWater() == true) {
        System.out.println("The " + plants.get(i).toString() + " Tree needs water");
      }
    }*/




/*    Watering with 40
    The yellow Flower doesnt need water
    The blue Flower doesnt need water
    The purple Tree needs water
    The orange Tree needs water

    Watering with 70
    The yellow Flower doesnt need water
    The blue Flower doesnt need water
    The purple Tree doesnt need water
    The orange Tree doesnt need water*/

    System.out.println(flower01.needsWater());
    System.out.println(tree01.needsWater());
    System.out.println(flower01.getWaterLevel());
    System.out.println(tree01.getWaterLevel());
  }
}
