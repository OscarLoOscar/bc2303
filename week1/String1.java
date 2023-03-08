package week1;

public class String1 {

  public static void main(String[] args){
    String name = "Today is a nice day";
    int age = 10;
    int index = 4;

    System.out.println("hello");
    System.out.println(name.charAt(0));//Varirable.Method ,,index 0 represents the 1st postition
    System.out.println(name.charAt(index)); //print y

    System.out.println(name.indexOf("i"));      //find the index of i
    System.out.println(name.indexOf("nice")); //can find 1 組字  

    System.out.println(name.trim()); //拎走晒頭尾既SPACE
    System.out.println(name.replace("Today" , "Tomorrow"));

    System.out.println(name.length()); //print 21
    System.out.println(name.substring(1,3)); //start from index 1 , end before index 3

    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());

    String newString = name.concat(",but raining.");
    String finalString = newString.toUpperCase();
    System.out.println(finalString);
    //same result
    System.out.println(name.concat(",but raining.").toUpperCase());

    //string dont use == , not a number

    String firstName1 = "John";
    if (firstName1.equals("Mary")){ //sting 可以直接.equals , 
      //the best way to compare String : if ("Target String".equals(Variable))
      System.err.println("hello");
    }else{
      System.out.println("yeah");
    }
    

    String firstName2 = "John"; 
    if ("Mary".equals(firstName2)){
      System.out.println("hello");
    }else{
      System.out.println("YEAH");

      //string世界”==”指緊地址一唔一樣,equals check 內容一唔一樣

      String s1 = "Hello";
String s2 = "Hello";
System.out.println(s1 == s2); // prints true
System.out.println(s1.equals(s2));  // prints true

String s3 = new String("Hello");
String s4 = new String("Hello");
System.out.println(s3 == s4); // prints false
System.out.println(s3.equals(s4));  // prints true

String str = "brown ";
String myString = "The " + "quick " + str + "fox..."; // expensive
System.out.println("The quick brown fox..." == myString); // prints false
System.out.println("The quick brown fox...".equals(myString)); // prints true







Integer i1 = new Integer(10); //wrapper class強行開新OBJECT,class = programe
Integer i2 = new Integer(10); //new coding : int i2 =Integer.valueOf(10)

if (i1==i2){
  System.out.println("They are the same object in Haep");
}else{
  System.out.println("They are not the same object in Heap");
}
// System.out.println(i1.compareTo(i2));
if (i1.compareTo(i2) == 0){ //compare value,check內容
  System.out.println("They have equal value");
}else{
  System.out.println("They are not having equal value");
//primitive有自己RANGE，可以==，無地址，無OBJECT
}
}

//Wrapper Class limitation , -128 to 127
Integer d1 = 127;
Integer d2 = 127;
Integer e1 = 128;
Integer e2 = 128; //wrapper class over range
if (d1 == d2){
  System.out.println("d1 == d2");
}else{
  System.out.println("d1 != d2");
}
if (e1 == e2){
  System.out.println("e1 == e2");
}else{
  System.out.println("e1 != e2");
}

// Unboxing
int i = new Integer(1); //unboxing , suppose use Integer,but why int is ok ?
//autoboxing
Integer integer = 1000 ;// new Integer(1000)
Integer integer2 = 127; // find if there is existing object with value 127,if yes,put it into the same object
}
//
int y = Integer.valueOf(1); // new Integer(1)
boolean bool = Boolean.valueOf(true);//new Boolean(true)

Double bouble2 = new Double(10.98);//by default,10.98 is a type of double
Float float2 = new Float((float)10.98);
}


    
  


  

