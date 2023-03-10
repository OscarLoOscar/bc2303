package week2;

public class School {
  int area;
  Student student;

  public static void main(String[] args) {
    Student s1 = new Student();// instance or object
    s1.setFirstName("John");
    s1.setLastName("Watson");
    s1.setAge(19);
    s1.setCourses(null);

    Student s2 = new Student();
    s2.setLastName("Potter");
  }
}
