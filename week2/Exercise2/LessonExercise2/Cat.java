package week2.Exercise2.LessonExercise2;

public class Cat extends Animal {
  // inherited
  String color;

  public Cat() {
    super();
  }
  public Cat(String color,String Name){
    super(name);
    this.color = color;
  }
  public void setColor(String color) {
    this.color = color;

  }

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.setName("Kathy"); //1.繼承左ANIMAL
    cat.setColor("Color");

    Cat cat2 = new Cat("Sally", "Yellow");

  }

}
