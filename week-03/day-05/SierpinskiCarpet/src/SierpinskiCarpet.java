import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskiCarpet {

  public static void mainDraw(Graphics graphics) {
    int a = WIDTH / 3;
    int b = HEIGHT / 3;
    int size = WIDTH / 3;
    Random random = new Random();
    graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
    graphics.drawRect(0, 0, WIDTH, HEIGHT);
    drawCarpet(a, b, size, graphics);
  }
  
  public static void drawCarpet(int x, int y, int size, Graphics graphics) {
    drawSquare(x, y, size, graphics);
    if (size > 10) {
      drawCarpet(x - size * 2 / 3, y + size / 3, size / 3, graphics);
      drawCarpet(x + size + size / 3, y + size / 3, size / 3, graphics);
      drawCarpet(x + size / 3, y - size * 2 / 3, size / 3, graphics);
      drawCarpet(x + size / 3, y + size + size / 3, size / 3, graphics);
      drawCarpet(x - size * 2 / 3, y - size * 2 / 3, size / 3, graphics);
      drawCarpet(x - size * 2 / 3, y + size + size / 3, size / 3, graphics);
      drawCarpet(x + size + size / 3, y - size * 2 / 3, size / 3, graphics);
      drawCarpet(x + size + size / 3, y + size + size / 3, size / 3, graphics);
    }
  }

  public static void drawSquare(int x, int y, int size, Graphics graphics) {
    Random random = new Random();
    graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
    graphics.fillRect(x, y, size, size);
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