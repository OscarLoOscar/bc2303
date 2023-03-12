package week2;

public class Exam {
  private String type;
  private int score;
  private boolean isPassed;

  // Getter..
  public int getScore(){
    return this.score;
  }

  // Setter..
  public void setScore(int score) {
     this.score = score;
  }

  public void setIsPassed(int score) {
    if (this.score > 50) {
      this.isPassed = true;
    } else {
      this.isPassed = false;

    }
  }

  public boolean isPassed() {
    return this.isPassed;
  }
}
