public class Exceptionn {
  //errors have three types
  // compile time error  runtime error   logical error
  // compile time error means the error in syntax while typing the language
  // logical error is the error which cannot be detected by the compiler it can be hard to solve it
  // runtime error is the errror which occur on run time means you have built a software using one data of file and the app is working good but suddenly you delete the file and application stop working so it is run time error
  // run time is most important you have to solve it as you know that when you play games and you save game it also goes in it  also if you are in battle game of betting and you want to win it sunndendly your internet stop working then you restart but game cut off so its runtime issue so we have to solve it by exceptions

  // so we have two types of statement one is normal and one is critical we use try catch for critical statements
  //runtime errors we use these also catch excute inly when try throw exceptons
  public static void main(String[] args) {

    int i =0;
    int j=0;
    // try
    // {
    // j=18/i;
    //  }
    // catch(Exception e){
    //   System.out.println("Something went wrong");
    //  }


    try{
      j=18/i;
    }
    catch(Exception e){
      System.out.println("Went wrong");
    }
    System.out.println(j);
    System.out.println("By");
    


  }
}
