import java.util.concurrent.Flow.Subscriber;

import javax.swing.plaf.ToolTipUI;

/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class Exercise2 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // Use int name.charAt()
    // prints J
    System.out.println(str.charAt(15));
    // prints e
    System.out.println(str.charAt(1));
    // Use int indexOf(int ch), or int indexOf(String ch)
    // prints 3
    System.out.println(str.indexOf("tu"));
    // prints 9
    System.out.println(str.indexOf("xL"));
    // prints 10
    System.out.println(str.indexOf("LA"));

    // Use String trim()
    String abc = "    ab c    ";
    System.out.println(abc.trim());
    // prints "ab c"

    // Use String replace() method
    System.out.println(str.replace("Java","Coding"));
    // prints VenturenixLAB, Coding

    // int length()
    System.out.println(str.length());
    // prints 19

    // Use String substring(int start, int end)
    // prints "ren"
    System.out.println(str.substring(5, 8));

    // String toLowerCase(), and String toUpperCase()
    // print "VENTURENIXLAB, JAVA"
    System.out.println(str.toUpperCase());
    // prints "venturenixlab, java"
    System.out.println(str.toLowerCase());

    // Method Chaining, replaceAll(), toUpperCase(), concat()
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    System.out.println(str.replace("e","*").concat("!!!").toUpperCase());
  }

}