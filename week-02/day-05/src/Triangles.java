import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {

    int rows = 20;
    int triHeight = HEIGHT / rows;
    int triSide = WIDTH / rows;


    for (int i = 1; i <= rows; i++) {

      graphics.drawLine(WIDTH - (triSide * i), HEIGHT, WIDTH - (triSide / 2 * i),HEIGHT - (triHeight * i));
      graphics.drawLine(triSide * i, HEIGHT, (triSide / 2 * i),HEIGHT - (triHeight * i));
      graphics.drawLine(WIDTH / 2 - triSide / 2 * i, triHeight * i, WIDTH / 2 + triSide / 2 * i, triHeight * i);
    }
  }

  //    Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
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