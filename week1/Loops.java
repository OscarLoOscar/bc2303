package week1;

import javax.transaction.xa.XAException;

public class Loops {
  public static void main(String[] args) {
    // Approach 1 : FRO LOOP
    // int i = 0;

    // for (i = 0; i < 5; i++) { // 細階for，2個；,,count ; condition to contiune ;
    // change of i for every iteration
    // System.out.println("hello");
    // } // if i = 0 , then sysout wil run 5 times

    // // Approach 2 : While Loop,同for loop本質上一樣
    // i = 0; // 將 i back to 0
    // while (i < 5) { // condition to contiune
    // System.out.println("yeah");
    // i += 1;

    // }
    // // Approach 3 : do-while LOOP,先做第一次，做完再check condition
    // i = 0;
    // do {
    // System.out.println("HEY");
    // i++;
    // } while (i < 5); // condition to contiune

    // // for loop with break
    // for (int a = 0; a < 5; a++) {
    // System.out.println("a=" + a);
    // if (a == 4) {
    // break; // this break will exit the for loop
    // }
    // }
    // Nested for loop
    // for (int x = 0; x < 7; x++) {
    // for (int y = 0; y <= 6; y++) {
    // for (int z = 0; z < 10; z++)
    // System.out.println("x=" + x + ",y=" + y + ",z=" + z);
    // }
    // }
    // for (int x = 0; x < 1; x++) {
    // for (int y = 0; y < 5; y++)
    // System.out.println("x=" + x + ",y=" + y);
    // }

    /*    */
    /*   **/
    /*  ***/
    /* ****/
    /******/
    // for (int r = 0;r < 5 ; r++){
    // System.out.print("*");
    // }
    {
      for (int x = 0; x < 5; x++) {
        for (int y = x; y >= 0; y--) {
          System.out.print("*");
        }
        System.out.println("1");
      }

      for (int x = 4; x >= 0; x--) {
        for (int y = x; y >= 0; y--) {
          System.out.print("*");
        }
        System.out.println("2");
      }

      for (int x = 0; x < 5; x++) {
        for (int z = 4 - x; z > 0; z--) {
          System.out.print(" ");
        }
        for (int y = x; y >= 0; y--) {
          System.out.print("*");
        }
        System.out.println("");
      }
    }
  }
}
