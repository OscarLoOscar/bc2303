package week1;

public class Datatype {
  public static void main(String[]args){ //method
    //the variable inside a method is loval variable

    //char,ASCII code,只可以送一個整數,記數字，大寫細寫個range
//     char gender = 48;
// System.out.println(gender);

// String amount1 = 1000;
// String amount2 = String.valueof(1000);

// int a = 1; //primitive
// // int c = 1;
// Integer b = 1;//non-primitive data type (TYPE)
// a = Integer.MAX_VALUE;
// c = a + 1;
// System.out.println("a=" + a); 
// System.out.println("c=" + c);//一個loop,overflow

// int i = 200;
// byte j = (byte)i;//downgrade
// System.out.println(j);//prints -56,overflow

// //naming conversion
// final int DAYS_OF_A_WEEK = 7; //final會用大寫
// int DaysofYear = 52 * DAYS_OF_A_WEEK;

// //Operators
// int x =10;
// x = x +1;
// x++;
// x += 1; //x = x + 1;
// x -= 2; //x = x - 2;
// x *= 3; //x = x * 3;
// x /= 11;//x = x / 11;
// System.out.println(x); //x = 3;
// x--; // x = x - 1;
// System.out.println(x); //x = 2;

//Reminder
int s = 10;
int reminder = s % 3;
System.out.println(reminder);// reminder = 1,要記
  

int counter = 1;
System.out.println(counter);   //0
System.out.println(++counter); //1 , execute ++ first ,the println
System.out.println(counter);   //1
System.out.println(counter++); //1 , println first,then ++
System.out.println(counter);   //2
}
}
