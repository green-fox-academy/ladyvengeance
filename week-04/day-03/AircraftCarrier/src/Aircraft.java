public class Aircraft {
  private String type;
  private int ammo = 0;
  private int maxAmmo;
  private int baseDamage;

  public int fight() {
    int damage = baseDamage * ammo;
    ammo = 0;
    return damage;
  }

  public int refill(int ammoToFill) {
    int extraAmmo = ammoToFill - maxAmmo;
    return extraAmmo;
  }

  public String getType(String type) {
    this.type = type;
    return type.toString();
  }

  public String getStatus(String type, int ammo, int baseDamage, int damage) {
    return "Type " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + damage;
  }

  public boolean isPriority(F35 name) {
    return true;
  }

  public int getAmmo(String type) {
    return ammo;
  }
}
