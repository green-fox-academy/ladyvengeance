import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(15);
    al.add(25);
    al.add(42);
    al.add(3);
    al.add(8);

    System.out.println(sum(al));
  }

  public static int sum(ArrayList<Integer> input) {
    int sum = 0;
    for (Integer integer : input) {
      sum += integer;
    }
    return sum;
  }
}
