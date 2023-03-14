package week2.Exercise2.LessonExercise3;

public abstract class Food {
  private String name;
  private String type;
  private int price;

  public Food(String name, String type, int price) {
    this.name = name;
    this.type = type;
    this.price = price;
  }

  public Food() {

  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name = name;
  }

  public void setTypee(String type) {
    this.type = type;
  }

  public String getType() {
    return this.type = type;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return this.price = price;
  }

  public void itIsFree() {
    System.out.println("Free Cake");
  }

}
