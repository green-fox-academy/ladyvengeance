public class TodoPrint {
  public static void main(String... args) {
    String todoText = " - Buy milk\n";

    StringBuilder newTodo = new StringBuilder(todoText);
    newTodo.insert(0, "My todo:\n");
    newTodo.append(" - Download games\n\t - Diablo");

    System.out.println(newTodo);
  }
}
