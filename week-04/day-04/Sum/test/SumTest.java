import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
  Sum s = new Sum();
  ArrayList<Integer> al = new ArrayList<>();

  @Test
  public void testSumAL() {
    al.add(1);
    al.add(2);
    al.add(3);
    int sum = 0;

    for (Integer integer : al) {
      sum += integer;
    }
    assertEquals(6, sum);
  }

  @Test
  public void testSumALWithEmptyList() {
    int sum = 0;

    for (Integer integer : al) {
      sum += integer;
    }
    assertEquals(0, sum);
  }

  @Test
  public void testSumALWithOneElement() {
    al.add(1);
    int sum = 0;

    for (Integer integer : al) {
      sum += integer;
    }
    assertEquals(1, sum);
  }

  @Test(expected=NullPointerException.class)
  public void testSumALWithNull() {
    al = null;

    int sum = 0;

    for (Integer integer : al) {
      sum += integer;
    }
    assertEquals(0, sum);
  }
}