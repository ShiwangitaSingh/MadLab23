public class Main {

  public static void main(String[] args) {
    int rows = 4;

    for(int i = rows; i > 0; i--) {
      for(int space = 1; space <= rows - i; space++) {
        System.out.print(" ");
      }

      for(int j=i; j <= i;j++) {
        System.out.print("* ");
      }

      for(int j = 0; j < i - 1; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}