package week1;

public class String1 {

  public static void main(String[] args) {
    String name = "Today is a nice day";
    int age = 10;
    int index = 4;

    System.out.println("hello");
    System.out.println(name.charAt(0));// Varirable.Method ,,index 0 represents the 1st postition, print T
    System.out.println(name.charAt(index)); // print y

    System.out.println(name.indexOf("i")); // find the index of i,print 6
    System.out.println(name.indexOf("nice")); // can find 1 組字 ,print 11

    System.out.println(name.trim()); // 拎走晒頭尾既SPACE,print Today is a nice day
    System.out.println(name.replace("Today", "Tomorrow"));// print Tomorrow is a nice day

    System.out.println(name.length()); // print 21
    System.out.println(name.substring(1, 3)); // start from index 1 , end before index 3,print od

    System.out.println(name.toUpperCase());// print TODAY IS A NICE DAY
    System.out.println(name.toLowerCase());// print today is a nice day

    String newString = name.concat(",but raining.");
    String finalString = newString.toUpperCase();
    System.out.println(finalString); // print TODAY IS A NICE DAY,BUT RAINING
    // same result
    System.out.println(name.concat(",but raining.").toUpperCase());// print TODAY IS A NICE DAY,BUT RAINING

    // string dont use == , not a number

    String firstName1 = "John";
    if (firstName1.equals("Mary")) { // str ing 可以直接.equals , **********************
      // the best way to compare String : if ("Target
      // String".equals(Variable))***********************
      System.out.println("hello");
    } else {
      System.out.println("yeah");
    }

    String firstName2 = "John";
    if ("Mary".equals(firstName2)) {
      System.out.println("hello");
    } else {
      System.out.println("YEAH");
    }
    // string世界”==”指緊地址一唔一樣,equals check 內容一唔一樣

    String s1 = "Hello";
    String s2 = "Hello";
    System.out.println(s1 == s2); // prints true
    System.out.println(s1.equals(s2)); // prints true

    String s3 = new String("Hello");
    String s4 = new String("Hello");
    System.out.println(s3 == s4); // prints false
    System.out.println(s3.equals(s4)); // prints true

    String str = "brown ";
    String myString = "The " + "quick " + str + "fox..."; // expensive
    System.out.println("The quick brown fox..." == myString); // prints false
    System.out.println("The quick brown fox...".equals(myString)); // prints true

    Integer i1 = new Integer(10); // wrapper class強行開新OBJECT,class = programe
    Integer i2 = new Integer(10); // new coding : int i2 =Integer.valueOf(10)

    if (i1 == i2) {
      System.out.println("They are the same object in Haep");
    } else {
      System.out.println("They are not the same object in Heap");
    }
    // System.out.println(i1.compareTo(i2));
    if (i1.compareTo(i2) == 0) { // compare value,check內容
      System.out.println("They have equal value");
    } else {
      System.out.println("They are not having equal value");
      // primitive有自己RANGE，可以==，無地址，無OBJECT
    }

    // Wrapper Class limitation , -128 to 127
    Integer d1 = 127;
    Integer d2 = 127;
    Integer e1 = 128;
    Integer e2 = 128; // wrapper class over range
    if (d1 == d2) {
      System.out.println("d1 == d2");
    } else {
      System.out.println("d1 != d2");
    }
    if (e1 == e2) {
      System.out.println("e1 == e2");
    } else {
      System.out.println("e1 != e2");
    }

    // Unboxing
    int i = new Integer(1); // unboxing , suppose use Integer,but why int is ok ?
    // autoboxing
    Integer integer = 1000;// new Integer(1000)
    Integer integer2 = 127; // find if there is existing object with value 127,if yes,put it into the same
                            // object

    //
    int y = Integer.valueOf(1); // new Integer(1)
    boolean bool = Boolean.valueOf(true);// new Boolean(true)

    Double bouble2 = new Double(10.98);// by default,10.98 is a type of double
    Float float2 = new Float((float) 10.98);

    Character char3 = new Character('a');
    char c = 'a';
    Character c2 = new Character('a');

    // autoboxing，背後做緊既野

    // class好處，有工具method用 - non-primitive data types
    // string 係STATE，CharAt,indexOf係BEHAVIOUR
    // Conditionals/Flow & Loops

    // no break example

    int Grade = 90;
    int score = 0;

    switch (Grade) {
      case 90: {
        score += 10;
      }
      case 80: {
        score += 10;
      }
      case 70: {
        score += 10;
        // ... lines of code
      }
      case 60: {
        score += 10;
      }
      case 50: {
        score += 10;
      }
      case 40: {
        score += 10;
      }
      case 30: {
        score += 10;
      }
      case 20: {
        score += 10;
      }
      case 10: {
        score += 10;
      }
      default: {
        break;
      }
    }
    System.out.println("score: " + score);// prints 'C'
  }
}
