package week2;

public class Student {
  // Attributes
  private String firstName; // pricate attributes,開放method
  private String lastName;
  private int age;
  double passRate;

  // Behaviours / method / fuction
  // Setting of firstName
  public void setFirstName(String firstName) { // 一篇描述STUDENT的文章
    this.firstName = firstName; // this mean this object , 係SCHOOL input既object refer to setFirstName
  }

  public void setLastName(String lastName) { // 一篇描述STUDENT的文章
    this.lastName = lastName;
  }

  public void setAge(int i) {
    this.age = i;

  }

  // Getting of firstName
  public String getFirstName() { // 有public and private
    return this.firstName;// 帶野return，要同return出去個舊野match
  }

  public String getLastName() {
    return this.lastName;
  }

  public int age() {
    return this.age;
  }

  //

  public void setPassRate(double passRate) {
    this.passRate = passRate;
  }

  public double getPassRate() {
    return this.passRate;
  }

  public double getPassRateInPercentage() {
    return this.passRate * 100;
  }
  //

  public void setFullName(String firstName) {
    this.firstName = firstName;
  }

  public String getFullName() {
    return this.firstName + "" + this.lastName;
  }

  public String toString() {
    System.out.println(this.firstName//
        + "" + this.lastName //
        + "" + this.age);
    // set唔會return野出去
    return firstName;
    // 比abstract意思（非具體methods），有D methods 未完成到，可以選擇性用
    // extends 係執行合約既一個過程
  }

  public Student() { // 所有class 隱含地extends object，天生有個constructor,可以多過一個

  }

  // all-argument constructor
  public Student(String firstName, String lastName, int age) { // non-empty constructor,一有呢個，EMPTY CONSTRUCTOR會清失
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

}