public class Tree extends Plant {
  public Tree(String name) {
    super(name);
  }

  public boolean needsWater() {
    boolean needsWater = getWaterLevel() < 10;
    return needsWater;
  }

  public void waterPlant(int amountOfWater) {
    if (getWaterLevel() < 10) {
      setWaterLevel(amountOfWater * 0.4);
    }
  }
}
