import java.util.*;

public class Candyshop{
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    System.out.println(sweets(arrayList));
    
  }
  public static ArrayList<Object> sweets(ArrayList<Object> input) {
    for (int i = 0; i < input.size(); i++) {
      if (input.get(i) == (Object)2) {
        input.set(i, "Croissant");
      } else if (input.get(i) == (Object)false) {
        input.set(i, "Ice cream");
      }
    }
    return input;
  }
}