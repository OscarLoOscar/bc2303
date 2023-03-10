package week1;

import java.lang.reflect.Array;
import java.util.ArrayList; //import some libery,auto-import fuction
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.naming.ldap.StartTlsRequest;

public class List1 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>(); // arraylist is class
                                                      // <>skip Integer inside in Java1.5
    arrayList.add(100); // List無長度限制，無限制數量
    arrayList.add(4);
    arrayList.add(124356);
    arrayList.remove(1); // remove index
    System.out.println(arrayList); // arrayList背後都係一條array
    System.out.println(arrayList.size());// size=1
    System.out.println(arrayList.get(0) + " (line 16)");

    ArrayList<Integer> integers = new ArrayList<>(); // remember how to new arraylist !!!
    integers.add(5);
    integers.add(3);
    arrayList.addAll(integers);
    System.out.println(integers);

    for (Integer i : arrayList) {// right handside can put in arraylist / array
      System.out.println(i);
    }

    // String Array List
    // Declare Arraylist of String
    ArrayList<String> strArr = new ArrayList<>();
    strArr.add("Tesla");
    strArr.add("Apple");
    strArr.add("AWS");
    System.out.println(strArr.get(1)); // print Apple
    strArr.set(1, "Amazon");
    System.out.println(strArr.get(1)); // print Amazon

    //find tyhe index of apple : 1.contains,2.indexof
    int indexOfApple = strArr.indexOf("Apple");
    System.out.println("indexOfApple = "+indexOfApple);

    // strArr.set(100,"Crazy"); 無100咁多

    strArr.remove("Tesl"); // cannot remove Tesla
    strArr.remove(0); // put in Object is ok
    System.out.println(strArr); // [Amazon,AWS]

    // if (strArr.contains("Tesla") == false); 用法啱但無人咁寫
    if (!strArr.contains("Tesla")) { // remember
      System.out.println("The list has no Tesla");
    }
    strArr.add("Yellow");
    strArr.add("123");
    strArr.add("你好");
    System.out.println(strArr);

    Collections.sort(strArr);// sort字母
    System.out.println(strArr);

    //
    ArrayList<Long> longList = new ArrayList<>();
    longList.add(10L);
    longList.add(-4L);
    System.out.println(longList);
    //

    List<Long> longList2 = Arrays.asList(10L, -4L);
    // longList2.add(3L);
    System.out.println(longList2);

    List<Long> longList3 = new ArrayList<>(Arrays.asList(10L, -4L));
    longList3.add(3L);
    System.out.println(longList3);

    List<String> weekdays = Arrays.asList("Monday", "tuesday", "Wednesday", "thursday", "Friday");
    // weekdays.add("Sunday");
    System.out.println(weekdays);

    }

  }

// arrays.fill
// Arrays.copyOf
// Arrays.equals