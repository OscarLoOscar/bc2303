package week2.Exercise2.LessonExercise3;

public class Dessert extends Food {
  String colour;

  public Dessert(String colour, String name, String type, int price) {
    super(name, type, price);
    this.colour = colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public String getColour() {
    return this.colour = colour;
  }

  @Override
  public String toString() {
    return "[" + this.colour + ""//
        + super.getName() + ""//因為Class Food private 左constructor name，記用super. [[refer to super class]]
        + super.getPrice() + ""//
        + "$" + //
        super.getPrice() + "]";
  }

  @Override
  public void itIsFree() {
    System.out.println("Not Free  Anymore");
  }

  public static void main(String[] args) {
    // Food A1 = new Food("Yello","Mango",null,198); //呢一步無需要，abstract一個class係為左有D
    // constructor唔再改變
    Dessert eat1 = new Dessert("Black", "Choco", "cake", 98);
    System.out.println(eat1.toString());
    eat1.itIsFree();
  }
}
