import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {
  public static void mainDraw(Graphics graphics){

    int max = 220;
    int min = 20;

    int x = (int)(Math.random() * ((max-min) + 1)) + min;
    int y = (int)(Math.random() * ((max-min) + 1)) + min;

    for (int i = 1; i < 4; i++) {
      drawSquare(x * i, y * i, graphics);
    }
  }

  public static void drawSquare (int x, int y, Graphics graphics) {
    graphics.drawRect(x, y, 50, 50);
  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

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