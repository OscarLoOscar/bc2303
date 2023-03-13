package week2.Exercise2.LessonExercise1;

public class Wine {
  private String grape;
  private int vintage;
  private String region;

  // 出面set野入黎
  public void setgrape(String grape) {
    this.grape = grape;
  }

  public void setvintage(int vintage) {
    this.vintage = vintage;
  }

  public void setregion(String region) {
    this.region = region;
  }

  // getter of
  public String getgrape() {
    return this.grape;
  }

  public int getvintage() {
    return this.vintage;
  }

  public String getregion() {
    return this.region;
  }

  public Wine(String grape, int vintage, String region) {
    this.grape = grape;
    this.vintage = vintage;
    this.region = region;

    Wine wine1 = new Wine("cab", 2009, "France");
    System.out.println(this.grape + "" + this.vintage + "" + this.region);
  }
}
