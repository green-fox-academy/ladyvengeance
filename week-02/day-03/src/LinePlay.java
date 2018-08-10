import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {

    int incr = 10;
    for (int i = 0; i < WIDTH; i++) {
      if (incr <= WIDTH) {
        drawUpperLines(incr, graphics);
        drawLowerLines(incr, graphics);
        incr += 10;
      }
    }
  }

  public static void drawUpperLines (int a, Graphics graphics) {
    graphics.drawLine(a, 0, WIDTH, a);
  }

  public static void drawLowerLines (int b, Graphics graphics) {
    graphics.drawLine(0, b, b, WIDTH);
  }

  //    Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}