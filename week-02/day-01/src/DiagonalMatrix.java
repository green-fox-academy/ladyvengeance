public class DiagonalMatrix {
  public static void main(String[] args) {
// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
    int[][] numArray = new int[4][4];

    for (int i = 0; i < numArray.length; i++) {
      for (int j = 0; j < numArray.length; j++) {
        if (i == j) {
          System.out.print("1 ");
        } else {
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }
}
