package week2;

import java.util.Arrays;

public class Test1 {
  public static void main(String[] args) {
    
    int[] array1 = new int[3];
    array1[1] = 100;
  System.out.println(Arrays.toString(array1));
 
  int[]array2 = new int[]{ 10,20,4,200};
  System.out.println(Arrays.toString(array2));

  for(int e : array2){
    System.out.println(e);
  }
    }
  }
