public class Throw {
//   throw new ArithmeticException("Not eligible");

// khud se exception create kar rahi hai.

// Agar condition true ho:

// JVM exception throw karegi
// control catch me chala jayega
  public static void main(String[] args) {
    int i=0;
    int j=0;
    try{
      j=18/i;
      if(j==0){
        throw new ArithmeticException();
      }
    }
    catch(ArithmeticException e){
     System.out.println("Divide by zero");
    }
    catch(Exception e){
      System.out.println("went wrong");
    }
  }
}
