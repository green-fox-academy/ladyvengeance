public class Flower extends Plant {
  public Flower(String name) {
    super(name);
  }

  public boolean needsWater() {
    boolean needsWater = getWaterLevel() < 5;
    return needsWater;
  }

  public void waterPlant(int amountOfWater) {
    if (getWaterLevel() < 5) {
      setWaterLevel(amountOfWater * 0.75);
    }
  }
}
