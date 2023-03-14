package week2.Exercise2.LessonExercise2;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Cat extends Animal { // 只能extend一樣,
  // inherited
  String color;

  // public Cat() { // constructor 1.
  // super();
  // }

  public Cat(String color, String name, int height, int weight, int age) {// constructor 2.
    super(name, height, weight, age); // call back class animal's constructor
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;

  }

  @Override // documentation，唔可以亂放
  public String toString() { // 本身有toString method，但做手腳出第二D野
    return "[" + this.color + " " + super.name //
        + "" + super.height//
        + "" + super.weight//
        + "" + super.age + "]";
  }

  public static void main(String[] args) {
    Cat cat1 = new Cat("white", "Kathy", 30, 5, 2); // Line 7，11 ； 所以有時唔洗入item，有時可以入
    cat1.setName("Dragon"); // 1.繼承左ANIMAL
    cat1.setColor("Black");

    System.out.println(cat1.toString());
    // Cat cat2 = new Cat("Sally", "Yellow");
    //
    //
    // public String sound(){ //return 右邊要有野接
    // System.out.println("Meow Meow Meow");

    // }
    // public void sound2(){
    // System.out.println("Meow Meow Meow");
    // }

  }
}