import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
  public static void mainDraw(Graphics graphics){

    int max = 220;
    int min = 20;

    int width = 20;
    int height = 30;

    graphics.setColor(Color.RED);
    graphics.drawRect((int)(Math.random() * ((max-min) + 1)) + min, (int)(Math.random() * ((max-min) + 1)) + min, width, height);
    graphics.setColor(Color.GREEN);
    graphics.drawRect((int)(Math.random() * ((max-min) + 1)) + min, (int)(Math.random() * ((max-min) + 1)) + min, width, height);
    graphics.setColor(Color.BLUE);
    graphics.drawRect((int)(Math.random() * ((max-min) + 1)) + min, (int)(Math.random() * ((max-min) + 1)) + min, width, height);
    graphics.setColor(Color.MAGENTA);
    graphics.drawRect((int)(Math.random() * ((max-min) + 1)) + min, (int)(Math.random() * ((max-min) + 1)) + min, width, height);
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