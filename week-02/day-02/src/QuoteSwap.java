import java.util.*;

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    System.out.println(quoteSwap(list));
  }
  public static String quoteSwap (ArrayList<String> input) {
    String temp = input.get(2);
    input.set(2, input.get(5));
    input.set(5, temp);

    String temp2 = "";
    for (int i = 0; i < input.size(); i++) {
      temp2 = temp2 + input.get(i) + " ";
    }
    return temp2;
  }
}