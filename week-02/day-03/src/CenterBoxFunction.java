import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {
  public static void mainDraw(Graphics graphics) {

    for (int i = 1; i < 4; i++) {
      int input = (int) (Math.random() * 200);
      drawSquare(input, graphics);
    }
  }

  public static void drawSquare (int size, Graphics graphics) {
    graphics.drawRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
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