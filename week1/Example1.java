package week1;

import java.util.Random; //array mix with loop

public class Example1 {

  public static void main(String[] args) {
    int[] numbers = new int[10];
    Random rand = new Random();

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = rand.nextInt(100); // generate a random number between 0 and 100
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " "); // print each number in the array
    }

  }
}