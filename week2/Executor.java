package week2;

import java.util.ArrayList;
import java.util.List;

public class Executor {

  public static void main(String[] args) {
    Student s1 = new Student();// instance or object
    s1.setFirstName("John");
    s1.setFirstName("Watson");
    s1.setAge(19);
    s1.setCourses(null);

    Student s2 = new Student();
    s2.setFirstName("Potter");

    System.out.println(s1.getFirstName() + s1.getFirstName());
    System.out.println(s2.getFirstName() + s2.getFirstName());

    School school = new School();
    List<Student> students = new ArrayList<>();
    students.add(s1);
    students.add(s2);
    school.setStudents(students);

    // Exam
    Exam exam = new Exam();
    exam.setScore(60);

    if (exam.getScore() > 60) {// requirment
      System.out.println("Exam is passed");

      if (exam.isPassed()) {
        System.out.println("Exam is passed");
      }
    }
    Executor executor = new Executor();
execytor.age=(10);
execytor.setAge(10);
  }
}
