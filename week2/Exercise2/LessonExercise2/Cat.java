package week2.Exercise2.LessonExercise2;

public class Cat extends Animal {
  // inherited
  String color;

  public Cat() { // constructor 1.
    super();
  }

  public Cat(String color, String Name) {// constructor 2.
    super(name);
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;

  }

  public static void main(String[] args) {
    Cat cat = new Cat();  // Line 7，11 ； 所以有時唔洗入item，有時可以入
    cat.setName("Kathy"); // 1.繼承左ANIMAL
    cat.setColor("Color");

    Cat cat2 = new Cat("Sally", "Yellow");

  }

}
