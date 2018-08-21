public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();

    Flower flower01 = new Flower("yellow");
    Flower flower02 = new Flower("blue");
    Tree tree01 = new Tree("purple");
    Tree tree02 = new Tree("orange");

    garden.addPlant(flower01);
    garden.addPlant(flower02);
    garden.addPlant(tree01);
    garden.addPlant(tree02);

    garden.checkStatus();
    System.out.println();

    System.out.println("Watering with 40");
    garden.waterGarden(40);

    garden.checkStatus();
    System.out.println();

    System.out.println("Watering with 70");
    garden.waterGarden(70);

    garden.checkStatus();
  }
}
