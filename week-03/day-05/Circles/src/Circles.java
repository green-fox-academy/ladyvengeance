import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

  public static void mainDraw(Graphics graphics) {
    int a = 0;
    int b = 0;
    int size = WIDTH;

    Random random = new Random();
    graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));

    drawCircles(a, b, size, graphics);
  }

  public static void drawCircles(int x, int y, int size, Graphics graphics) {
    Random random = new Random();
    graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
    graphics.drawOval(x, y, size, size);

    if (size > 20) {
      drawCircles(x + size / 4, y, size / 2, graphics);
      drawCircles(x ,y + size / 3, size / 2, graphics);
      drawCircles(x + size / 2, y + size / 3, size / 2, graphics);
    }
  }

  // Don't touch the code below
  static int WIDTH = 729;
  static int HEIGHT = 729;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}