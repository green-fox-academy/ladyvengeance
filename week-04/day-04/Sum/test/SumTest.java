import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
  Sum s = new Sum();
  ArrayList<Integer> al = new ArrayList<>();

  @Before
  public void setUp() {
    al.add(1);
    al.add(2);
    al.add(3);
  }

  @Test
  public void testSumAL() {
    int sum = 0;
    for (Integer integer : al) {
      sum += integer;
    }
    assertEquals(6, sum);
  }
}