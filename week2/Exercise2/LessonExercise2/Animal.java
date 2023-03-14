package week2.Exercise2.LessonExercise2;

public abstract class Animal { // abstract class唔應該有cnstructor,abstract 抽象的
  String name; // attribite
  int height;
  int weight;
  int age;

  public Animal(String name, int height, int weight, int age) { // constructor
    this.name = name;
    this.height = height;
    this.weight = weight;
    this.age = age;
  }

  // public Animal(String name) { // constructor
  // this.name = name;

  // }

  // public Animal(int height) {
  // this.height = height;
  // }

  public Animal() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name = name;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getHeight() {
    return this.height = height;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getWeight() {
    return this.weight = weight;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age = age;
  }

  //
  //
  //

  public void sound() {
    System.out.println("Meow");
  }

  public String sound2() {
    return "Meow Meow"; // it has return type
  }

  public static void main(String[] args) {
    Animal animal1 = new Animal("Name",30,5,2);
    Animal animal2=new Animal();
    System.out.println(animal1);
    System.out.println(animal2);
    // Animal.sound(); // 有main先寫到野入memory，先可以利用class執進行邏輯判斷
    // String sound = Animal.sound2(); // <<this is object
public abstract void sound();
public String sound2(){
  return "Meow Meow";
}
public int sum (int x,int y){return x+y;
  }
  }
}
