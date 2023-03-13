package week2.Exercise2.LessonExercise1;

import java.util.List;

public class Vintage {
  List<Vintage> vintage;

  public List<Vintage> getVintage() {
    return this.vintage;
  }

  public void getVintage(List<Vintage> vintage) {
    this.vintage = vintage;
  }

  public static void main(String[] args) {

    int i = 1980;
    for (i = 1980; i < 2023; i++) {
      System.out.println(i + 1);
    }

  }
}
