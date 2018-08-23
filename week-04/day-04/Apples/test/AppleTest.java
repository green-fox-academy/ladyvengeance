import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
  String apple ="redAple";
  Apple a = new Apple(apple);

  @Test
  public void testApple() {
    assertEquals(apple, a.printApple());
  }
}