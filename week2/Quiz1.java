package week2;

import java.util.ArrayList;
import java.util.Arrays;

//model ans : BADABDDACB
//            CDDAAAABAC
public class Quiz1 {
  public static void main(String[] args) {
    int price = 150;
    int quantity = 10;
    float discount = 0.9f;
    System.out.println("q1= " + price * quantity * discount);
    //
    byte hoursOfDay = 24; // overflow
    byte daysOfWeek = 7;
    byte hoursOfWeek = (byte) (hoursOfDay * daysOfWeek);
    System.out.println("q2 = " + hoursOfWeek);

    // Q5
    String str = "";
    for (byte i = 127; i < 128; i++) {
      str += i;
      if (i < 0) {
        break;
      }
    }
    System.out.println("q5=" + str); //127 -128
    //
    // String stra = "";
    // for (byte i = 127; i < 128; i++) {
    // if (i < 0) {
    // continue;
    // }
    // stra += i;
    // System.out.println("q6=" + str);// 無限LOOP

    //Q7
    int[] integers = { 20, 10, 40 };
    byte[] bytes = new byte[] { 2, 4, 1 };
    int score = 0;
    for (int i = 0; i < 3; i++) {
      if (i % 2 == 1) {
        score += integers[i];
      } else {
        score += bytes[i];
      }
      System.out.println("q7 = " + score);
    }

    //Q8
    ArrayList<Byte> bytes8 = new ArrayList<>();
    bytes8.add((byte) 20);
    bytes8.add((byte) 14);
    bytes8.add((byte) 30);
    bytes8.remove(1);

    int total = 0;
    for (Byte price8 : bytes8) {
      total = price8;
    }
    System.out.println("total" + total);
    System.out.println("bytes" + bytes8);

    // Q9
    // String[] strings = new String[3];
    // String sum = "";

    // for (int i = 0; i < 4; i++) {
    // strings[i] = String.valueOf(i);
    // sum += strings[i];
    // }
    // System.out.println(sum);// Index 3 out of bounds for length 3 , runtime error
    // Compile error = syntax errors, missing or incorrect class references, or
    // other issues that prevent the code from being compiled into an executable
    // program

    // runtime error = invalid user input, incorrect calculations, or unexpected
    // program behavior.

    // Quiz10
    int a = 0;
    while (a < 3) {
      switch (a) {
        case 0:
          System.out.println("0");
        case 2:
          System.out.println("2"); // When the value of 'a' is incremented to 1, the switch statement will not
                                   // match any of the cases and the code will simply continue to the next
                                   // iteration of the while loop.

      }
      a++;

    }
  }
}