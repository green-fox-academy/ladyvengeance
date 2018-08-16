public class DiceSet {
  // You have a `DiceSet` class which has a list for 6 dice
  // You can roll all of them with roll()
  // Check the current rolled numbers with getCurrent()
  // You can reroll with reroll()
  // Your task is to roll the dice until all of the dice are 6
  int[] die = new int[6];

  public int[] roll() {
    for (int i = 0; i < die.length; i++) {
      die[i] = (int) (Math.random() * 6) + 1;
    }
    return die;
  }

  public int[] getCurrent() {
    return die;
  }

  public int getCurrent(int i) {
    return die[i];
  }

  public void reroll() {
    for (int i = 0; i < die.length; i++) {
      die[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    die[k] = (int) (Math.random() * 6) + 1;
  }

  public static void main(String[] args) {
    DiceSet diceSet = new DiceSet();
    diceSet.getCurrent();
    diceSet.roll();
    diceSet.getCurrent();
    diceSet.getCurrent(5);
    diceSet.reroll();
    diceSet.getCurrent();
    diceSet.reroll(4);
    diceSet.getCurrent();

    System.out.println(diceSet.roll()[0]);
    System.out.println(diceSet.getCurrent(5));
  }
}