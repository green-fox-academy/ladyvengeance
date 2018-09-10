public class Fox {
  String name;
  String type;
  String color;

  public Fox(String name, String type, String color) {
    this.name = name;
    this.type = type;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "Fox:\n" +
        "name = " + name + "\n" +
        "type = " + type + "\n" +
        "color = " + color + "\n";
  }
}
