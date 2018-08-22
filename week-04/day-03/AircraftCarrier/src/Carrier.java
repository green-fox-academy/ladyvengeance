import java.util.ArrayList;

public class Carrier {
  ArrayList<Aircraft> mother = new ArrayList<>();
  private int storeOfAmmo;
  private int healthPoint;

  public Carrier(int storeOfAmmo) {
    this.storeOfAmmo = storeOfAmmo;
    this.healthPoint = healthPoint;
  }

  public void add(Aircraft name) {
    mother.add(name);
  }

  public void fill() {
    for (Aircraft aircraft : mother) {
     storeOfAmmo - ammo
    }
  }

  public void fight(Carrier carrier) {
    int damage = ;
    for (Aircraft aircraft : mother) {
      aircraft.getAmmo()++;
    }
    return damage;healthPoint = mother.
  }

  public void getStatus (String type, int ammo, int baseDamage, int damage) {
    System.out.println("HP: " + healthPoint + ", Aircraft count: " + mother.size() + ", Ammo Storage: " + storeOfAmmo + ", Total damage: " + damage + "\nAircrafts:\n");
    for (Aircraft aircraft : mother) {
      System.out.println(aircraft.getStatus(type, ammo, baseDamage, damage));
    }
  }
}
