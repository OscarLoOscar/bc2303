package week2;

import java.util.ArrayList;
import java.util.List;

public class Executor {

  public static void main(String[] args) {
    Student s1 = new Student();// instance or object
    s1.setFirstName("John");
    s1.setFirstName("Watson");
    s1.setAge(19);

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
    // Executor executor = new Executor();
    // executor.age = (10);
    // executor.setAge(10);

    //encapsulation ： 透過public methods 去控制private既methods,*透過methods去組合state**
    // think about whats the raw data
    Student st1 = new Student();//constructor，一個方式construct個object
    st1.setFirstName("John");
    st1.setLastName("WONG");
    System.out.println(st1.getFullName());

    st1.getPassRate(0.23);
    st1.getPassRateInPercentage();

    //toString
    System.out.println(st1.toString()); 
    //constructor
    Student st2 =  new Student();
    st2.setFirstName("John");

    //all arhuments constructor , student("john","lau",24)
    Student st3 = new Student("John","Lau",24);
    st3.setFirstName("Mary");

    System.out.println(st3);
  }
}
