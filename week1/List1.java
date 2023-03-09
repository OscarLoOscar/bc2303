package week1;

import java.lang.reflect.Array;
import java.util.ArrayList; //import some libery,auto-import fuction

public class List1 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>(); // arraylist is class
                                                      // <>skip Integer inside in Java1.5
    arrayList.add(100); // List無長度限制，無限制數量
    arrayList.add(4);
    arrayList.add(124356);
    arrayList.remove(1); //remove index
    System.out.println(arrayList); //arrayList背後都係一條array
    System.out.println(arrayList.size());//size=1
    System.out.println(arrayList.get(0)+" (line 16)");

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(5);
    integers.add(3);
    arrayList.addAll(integers);
    System.out.println(integers);

    for (Integer i : arrayList){
      System.out.println(i);
    }
  }
}
