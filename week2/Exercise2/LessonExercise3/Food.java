package week2.Exercise2.LessonExercise3;

public abstract class Food {
  private String name;
  private int calories;
  private int price;
  

  public Food(String name, int calories, int price) {
    this.name = name;
    this.calories = calories;
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

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public int getCalories() {
    return this.calories = calories;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return this.price = price;
  }

  public void itIsFree() {

    int i = this.price;
      if (i < 98) {
        System.out.println("This is Free");
      } else {
        if (i >= 98) {
          System.out.println("This is not Free");
        }

      }
    }
  }