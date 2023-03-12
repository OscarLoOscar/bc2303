package week1;

import java.util.Arrays;

public class Array1 {
  public static void main(String[] args) {
    int[] array1 = new int[3];
    array1[1] = 100;
    System.out.println(Arrays.toString(array1));// print [0,100,0]

    int[] array2 = new int[] { 10, 20, 4, 200 };
    System.out.println(Arrays.toString(array2)); // print [10,20,4,200]

    // Enhanced for loop
    for (int e : array2) { // right handside put in what you want to Loop
      System.out.println("16行" + e); // print 10,20,40,200
    }

    int total = 0;
    for (int e : array2) {
      total = total + e; // come here 4 times
    }
    System.out.println("total:  "+total);

    // convert array2 to a String Array
    String[] strArray1 = new String[array2.length];
    
    for (String s : strArray1) {
      System.out.println(s); // print null,null,null,null,,不能改寫佢
    }
    
    String[] strArray2 = new String[array2.length];//11行己定義array2有幾長 //objective : 因為array2本身係int，要變做string，長度永遠一致

    for (int i = 0; i < strArray2.length; i++) {
      strArray2[i] = String.valueOf(array2[i]);
    }
    System.out.println(Arrays.toString(strArray2));

    String[] strArray3 = new String[]{"good morning" , "tomorrow"}; //remember this patten
  }
}
