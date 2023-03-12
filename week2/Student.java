package week2;

public class Student {
  // Attributes
  private String courses; //list of string 
  private String firstName; //pricate attributes,開放method
  private String lastName;
  private int age;

  // Behaviours / method / fuction
  // Setting of firstName
  public void setFirstName(String firstName) { // 一篇描述STUDENT的文章
    this.firstName = firstName; // this mean this object , 係SCHOOL input既object refer to setFirstName
  }

  public void setLastName(String lastName) { // 一篇描述STUDENT的文章
    this.lastName = lastName;
  }

  public void setCourses(Object object) { // void意思，無野retuen，霸住return type位置
    this.courses = courses;
  }

  public void setAge(int i) {
    this.age = i;

  }

  // Getting of firstName
  public String getFirstName() { //有public and private
    return this.firstName;// 帶野return，要同return出去個舊野match
  }

  public String getLastName() {
    return this.lastName;
  }

  public String courses() {
    return this.courses;
  }

  public int age() {
    return this.age;
  }
}
