public class Shifter implements CharSequence {
  private String input;
  private int numOfShift;

  public Shifter(String input, int numOfShift) {
    this.input = input;
    this.numOfShift = numOfShift;
  }

  @Override
  public int length() {
    return input.length();
  }

  @Override
  public char charAt(int index) {
    return input.charAt(index + numOfShift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
