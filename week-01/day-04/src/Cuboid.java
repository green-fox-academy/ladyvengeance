public class Cuboid {
  public static void main(String[] args) {
    //Surface area: 600
    //Volume: 1000

    //Surface area =  2 * (w * l + l * h + h * w)
    //Volume = l * w * h

    double surfaceArea = 600;
    double volume = 1000;

    double l = 10;
    double w = 10;
    double h = 10;

    if (2 * (l * w + l * h + w * h) == surfaceArea) {
      System.out.println("2 * (" + l + " * " + w + " + " + l + " * " + h + " + " + w + " * " + h + ") = " + surfaceArea);
    }
    if (l * w * h == volume) {
      System.out.println(l + " * " + w + " * " + h + " = " + volume);
    }
  }
}
