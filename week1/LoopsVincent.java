package week1;

public class LoopsVincent {
  public static void main(String[] args) {
    // /**
    // * * x=0, row=0, *
    // * ** x=1, row=1, **
    // * ***
    // * ****
    // * *****
    // */
    // for (int x = 0; x < 5; x++) { // rows
    // for (int y = x; y >= 0; y--) {
    // System.out.print("*");
    // }
    // System.out.println("");
    // }

    // /**
    // * *
    // * **
    // * ***
    // * ****
    // * *****
    // */
    // for (int x = 0; x < 5; x++) { // rows
    // // print space
    // for (int z = 4 - x; z > 0; z--) {
    // System.out.print(" ");
    // }
    // // print *
    // for (int y = x; y >= 0; y--) {
    // System.out.print("*");
    // }
    // System.out.println("");
    // }

    // *
    // ***
    // *****
    // *******
    // ********
    // Diamond
    for (int x = 0; x < 5; x++) { // rows // print space
      for (int z = 4 - x; z >= 0; z--) {
        System.out.print("1");
      }
      // print *
      for (int y = x; y >= 0; y--) {
        System.out.print("2");
      }
      // print mirror of *
      for (int y = x; y > 0; y--) {
        System.out.print("3");
      }
      System.out.println("4");
    }




    
    for (int x = 1; x < 5; x++) { // rows
      for (int y = x; y >= 0; y--) {
        System.out.print("5");
      }
      for (int z = 5 - x; z > 0; z--) {
        System.out.print("6");
      }
      // for loop
      System.out.println("7");

      // print mirror of *
    }
    for (int x = 1; x < 5; x++) {
      for (int y = x; y < 0; y++) {
        System.out.print("8");
      }
      System.out.print("9");
    }
  }
}
