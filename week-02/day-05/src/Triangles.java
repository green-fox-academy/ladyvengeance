import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {

/*
    graphics.drawRect(0, 0, WIDTH, HEIGHT);

    int c = (int)(Math.sqrt((WIDTH / 2) * (WIDTH / 2) + HEIGHT * HEIGHT));

    int a = 0;
    int b = (int)(Math.sqrt(WIDTH / 2 + a));
    int incr = 10;
    for (int i = 0; i < HEIGHT; i++) {
      if (a == 0) {
        graphics.drawLine(a, HEIGHT, WIDTH / 2, 0);
      } else {
        graphics.drawLine(a, HEIGHT, WIDTH / 2 + a / 2, b);
      }
      a += incr;
    }



    graphics.drawLine(50, HEIGHT, WIDTH / 2 + 50, 0);
    graphics.drawLine(WIDTH / 2, 0, WIDTH, HEIGHT);
    graphics.drawLine(0, HEIGHT, WIDTH, HEIGHT);
*/

    int x = 10;
    drawLeft(x, graphics);
    drawRight(x, graphics);
  }

  public static void drawLeft (int a, Graphics graphics) {
    int SIDE = (int) (Math.sqrt((WIDTH / 2) * (WIDTH / 2) + HEIGHT * HEIGHT));
    int numOfLines = WIDTH / a;
    int incr = SIDE / numOfLines;
    int temp1 = a;
    int temp2 = incr;

    graphics.drawLine(0, HEIGHT, WIDTH / 2, 0);
    graphics.drawLine(WIDTH / 2, 0, WIDTH, HEIGHT);
    graphics.drawLine(0, HEIGHT, WIDTH, HEIGHT);

    for (int i = 1; i < numOfLines; i++) {
      graphics.drawLine(a, HEIGHT, WIDTH / 2 + a / 2, (int) (Math.sqrt(incr * incr - (a / 2) * (a / 2))));
      a += temp1;
      incr += temp2;
    }
}

  public static void drawRight (int a, Graphics graphics) {
    int SIDE = (int) (Math.sqrt((WIDTH / 2) * (WIDTH / 2) + HEIGHT * HEIGHT));
    int numOfLines = WIDTH / a;
    int incr = SIDE / numOfLines;
    int temp1 = a;
    int temp2 = incr;

    graphics.drawLine(WIDTH / 2, 0, WIDTH, HEIGHT);

    for (int i = numOfLines; i > 1; i--) {
      graphics.drawLine(WIDTH / 2 - a, (int) (Math.sqrt(incr * incr - (a / 2) * (a / 2))), WIDTH - a, 0 );
      a += temp1;
      incr += temp2;
    }
  }

  public static void drawCentre (int a, Graphics graphics){
    graphics.drawLine(0, HEIGHT, WIDTH, HEIGHT);
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