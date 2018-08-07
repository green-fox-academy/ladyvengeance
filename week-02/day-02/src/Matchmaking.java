import java.util.*;

public class Matchmaking{
  public static void main(String... args){
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

    System.out.println(makingMatches(girls, boys));
  }
  public static ArrayList<String> makingMatches(ArrayList<String> input1, ArrayList<String> input2) {
    ArrayList<String> output = new ArrayList<>();

    for (int i = 0; i < input1.size(); i++) {
      output.add(input1.get(i));
      output.add(input2.get(i));
    }
    return output;
  }
}