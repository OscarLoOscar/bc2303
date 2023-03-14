package week2.Exercise2.LessonExercise3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Dessert extends Food {
  private boolean isSweet;

  public Dessert(String name, int calories, int price, boolean isSweet) {
    super(name, calories, price);
    this.isSweet = isSweet;
  }

  public Dessert() {
  }

  public boolean isSweet() {
    return isSweet = isSweet;
  }

  @Override
  public String toString() {
    return "[" + super.getName() + ""// 因為Class Food private 左constructor name，記用super. [[refer to super class]]
        + super.getCalories() + ""//
        + "$" + //
        super.getPrice() + //
        "]";
  }

  // @Override
  // public void itIsFree() {
  // System.out.println("Not Free Anymore");
  // }

  public static void main(String[] args) {
    // Food A1 = new Food("Yello","Mango",null,198); //呢一步無需要，abstract一個class係為左有D
    // constructor唔再改變
    // Dessert eat1 = new Dessert("Black", "Choco", "cake", 78);
    // System.out.println(eat1.toString());
    // eat1.itIsFree();
    //
    // Array :
    // Dessert[] dessert = new Dessert[3];
    // dessert[0] = new Dessert("Cake", 500, 128, true);
    // dessert[1] = new Dessert("Ice Cream", 400, 38, true);
    // dessert[2] = new Dessert("PanCake", 1200, 258, false);
    // for (int i = 0; i < dessert.length; i++) {
    // System.out.println(dessert[i].getName() + " has " + //
    // dessert[i].getCalories() + " calories and it sold $ " + //
    // dessert[i].getPrice() + " , and is sweet : " + //
    // dessert[i].isSweet() + " ");//
    // dessert[i].itIsFree();
    // print out :
    // Cake has 500 calories and it sold $ 128 , and is sweet : true
    // This is not Free
    // Ice Cream has 400 calories and it sold $ 38 , and is sweet : true
    // This is Free
    // PanCake has 1200 calories and it sold $ 258 , and is sweet : false
    // This is not Free
    //
    //
    // public Dessert(String name, int calories, int price, boolean isSweet)
    List<Dessert> dessertList = new ArrayList<>();
    dessertList.add(new Dessert("Cake", 500, 128, true)); // 第10行格式
    dessertList.add(new Dessert("Ice Cream", 400, 38, true));
    dessertList.add(new Dessert("PanCake", 1200, 258, false));
    dessertList.add(new Dessert("Rice", 480, 10, false));

    for (Dessert dessertMenu : dessertList) { // dessertMenu個名係自己改，改乜都得，但要方便人睇。右手邊係要loop既野
      System.out.println(dessertMenu.getName() + " has " + //
          dessertMenu.getCalories() + " calories and it sold $ " + //
          dessertMenu.getPrice() + " , and is it sweet ?  " + //
          dessertMenu.isSweet() + "  ");//
      dessertMenu.itIsFree(); // Class Food 寫左itIsFree 呢個method係做乜

    }
    //
    //
    //

    Dessert eat2 = new Dessert();
    eat2.setName(null);
    eat2.setPrice(178);
    System.out.println(eat2.toString().toUpperCase());
    eat2.itIsFree();
  }
}
