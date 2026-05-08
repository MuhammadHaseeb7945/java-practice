class Haseeb extends Exception{
   public Haseeb (){
    super();

   }
}



public class Custom_exception {
  public static void main(String[] args) {
    
     int i=10;
    int j=0;
    try{
      j=18/i;
      if(j==1){
        throw new Haseeb();
      }
  }
  catch(Haseeb e){

   System.out.println("My exception" + e);
      }
  
}}
