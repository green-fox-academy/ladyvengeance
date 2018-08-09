import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
  public static void mainDraw(Graphics graphics){

    int max = 220;
    int min = 20;

    int width = 20;
    int height = 30;

    int x1 = (int)(Math.random() * ((max-min) + 1)) + min;
    int y1 = (int)(Math.random() * ((max-min) + 1)) + min;
    int x2 = (int)(Math.random() * ((max-min) + 1)) + min;
    int y2 = (int)(Math.random() * ((max-min) + 1)) + min;
    int x3 = (int)(Math.random() * ((max-min) + 1)) + min;
    int y3 = (int)(Math.random() * ((max-min) + 1)) + min;
    int x4 = (int)(Math.random() * ((max-min) + 1)) + min;
    int y4 = (int)(Math.random() * ((max-min) + 1)) + min;

    graphics.setColor(Color.RED);
    graphics.drawRect(x1, y1, width, height);
    graphics.setColor(Color.GREEN);
    graphics.drawRect(x2, y2, width, height);
    graphics.setColor(Color.BLUE);
    graphics.drawRect(x3, y3, width, height);
    graphics.setColor(Color.MAGENTA);
    graphics.drawRect(x4, y4, width, height);
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