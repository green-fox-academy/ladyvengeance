public class DiagonalMatrix {
  public static void main(String[] args) {
    int[][] num = {
        {0},
        {1}
    };
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= n; j++) {
        if (i > 1 && i < n && j > 1 && j < n) {
          if (i == j) {
            System.out.print("%");
          } else {
            System.out.print(" ");
          }
        } else {
          System.out.print("%");
        }
      }
      System.out.println();
    }
  }
}
