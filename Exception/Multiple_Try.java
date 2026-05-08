public class Multiple_Try {
  public static void main(String[] args) {
    
    // so we can use multiple catch block for the try block and the parent class which is Exception will remain at the end of code 

    int i=0;
    int j=0;

    int nums[]=new int [5];

    try{
      j=18/i; // so jb idr error aya ga then next part excute ni hoga direct catch block ma chala jia ga so is lia only one exception pehla show ho ga
      System.out.print(nums[10]);
    }
    catch(ArithmeticException e){
      System.out.println("Divide by zero occur");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Array idex of bound");
    }
    catch(Exception e){
      System.out.println("Something went wrong");
    }

  }
}
