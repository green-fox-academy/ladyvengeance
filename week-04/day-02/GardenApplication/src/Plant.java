public class Plant {
  private String name;
  double waterLevel;

  public Plant(String name) {
    this.name = name;
    waterLevel = 0;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public boolean needsWater() {
    return true;
  }

  public void waterPlant(int amountOfWater) {
    System.out.println("Watering with " + amountOfWater);
  }

  @Override
  public String toString() {
    return name;
  }
}
