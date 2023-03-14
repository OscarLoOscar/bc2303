package week2.Exercise2.LessonExercise2;

public class Forexample {
  public static void doSomthing(int x) {
    x = 99;
  }

  public static void doSomthing(StringBuilder s) {
    s.append("OK");
  }
  public static void doSomthing(int x) {
    x = 99;
  }
  public static void sendEmail(String sender){
    sender="John'";
  }


  public static void main(String[] args) {
    // pass by value (scenario 1 - Primitive)
    int x = 10;
    doSomthing(x);
    System.out.println(x); // print 10

    // pass by Value (scenario 2 - Wrapper Class,total 8 wrapper class)
    Integer i = 10;
    doSomthing(i);
    System.out.println(x); // print 10

    // pass by Object Reference(pass the object address ) //死記
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Java");
    doSomthing(stringBuilder);
    System.out.println(stringBuilder.toString());// print : JavaOK

    //
    String sender = "Mary";
    sendEmail(sender);  //this method just help send email only
    if (sender.equals("Mary")) { // sender here stlill Mary
      System.out.println("OK");
    }

    Exam exam = new Exam();
    exam.setScore(90);
    doSomthing(exam);
    System.out.println(exam.getscore());
  }
}
