package week2.Exercise2.LessonExercise2;

import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.plaf.synth.SynthToolTipUI;

public class Car {
  private static String make;
  private String model;
  private int year;
  //

  public void setMake(String make) {
    this.make = make;
  }

  public void setmodel(String model) {
    this.model = model;
  }

  public void setYear(int year) {
    this.year = year;
  }

  // getter
  public String getMake() {
    return this.make;
  }

  public String getModel() {
    return this.model;
  }

  public int getYear() {
    return this.year;
  }

  // constructor
  public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public static void main(String[] args) {
    Car car2 = new Car("TOYOTA", "SC", 2010);
    System.out.println(car2.getMake() + "\n" + car2.getModel() + "\n" + car2.getYear());

    // toString
    System.out.println(car2.toString());

    // Constructor
    Car car3 = new Car("RTY", "pol", 2010); 
    car3.getMake();
    System.out.println(car3);

    // All Arguements constructor
    Car car4 = new Car("ABC", "abc", 1999);
    car4.getMake();

    Car car5;
    car5 = new Car(make, make, year);
    
  }

}
