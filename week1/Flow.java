package week1;

public class Flow {
  public static void main(String[]arg){
    int a = 0;

    //in this scebarion,line 8 -> 10 -> 12 ->13 ->15
    if(a + 1 > 2){ // > , < , >= , <=
      System.out.println("hello");
    } else if (a == 2) { // = means assignment , ==means chick if they are equal
      System.out.println("Code");
    } else {
      System.out.println("yeah"); //make sense寫法，唔等於java比你run
    }
    // end the if flow


    long b = 100;
    boolean isFemale = true;

    if(b == 100 && isFemale == false){ //&& means and
      System.out.println("hello");
    }else{
      System.out.println("code");
    }

    if(b == 99 || isFemale == true && b + 2 > 101 ){ // || means or , && first
      System.out.println("yes");
    }

    boolean o = false;
    if (o ==false){
    System.out.println("hello");
  }
  if (!o){ // !o , asking you if o is equal to false
    System.out.println("NO");

  }
}
  
}