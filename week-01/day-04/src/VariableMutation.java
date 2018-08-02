public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    a += 10;

    System.out.println(a);

    int b = 100;
    b -= 7;

    System.out.println(b);

    int c = 44;
    c *= 2;

    System.out.println(c);

    int d = 125;
    d /= 5;

    System.out.println(d);

    int e = 8;
    e *= e;
    e *= 8;

    System.out.println(e);

    int f1 = 123;
    int f2 = 345;
    boolean isF1BiggerThanF2 = f1 > f2;

    System.out.println(isF1BiggerThanF2);

    int g1 = 350;
    int g2 = 200;
    boolean isDoubleG2BiggerThanG1 = (g2 * 2) > g1;

    System.out.println(isDoubleG2BiggerThanG1);

    int h = 135798745;
    boolean is11ADivisor = h % 11 == 0;

    System.out.println(is11ADivisor);

    int i1 = 10;
    int i2 = 3;
    boolean isI1HigherThanI2SquaredAndSmallerThanI2Cubed = (i1 > i2 * i2) && (i1 < i2 * i2 * i2);

    System.out.println(isI1HigherThanI2SquaredAndSmallerThanI2Cubed);

    int j = 1521;
    boolean isDivisibleBy3Or5 = j % 3 == 0 || j % 5 == 0;

    System.out.println(isDivisibleBy3Or5);

    String k = "Apple";
    for (int i = 0; i < 4; i++) {
      System.out.println(k);
    }
 }
}
