public class Gnirts implements CharSequence {
  String input;

  @Override
  public int length() {
    return input.length();
  }

  @Override
  public char charAt(int index) {
    return input.charAt(input.length() - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  public Gnirts() {
    this.input = input;
  }
}
