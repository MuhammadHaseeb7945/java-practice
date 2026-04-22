
class mobile{
  public  mobile(){ // constructor automatically call hota ha jb object cerate hota ha hr bar call hota ha jb objct create hota ha
    String ah="now";
  };
  static {
  System.out.println("i am static block");
}
}

public class block_static {
  public static void main(String[]arg){
   mobile m= new mobile();
   // static block is trh kam krta ha jb class load hoti ha to wo start ho jata ha begar koi call kia automatically call ho jata  ha
 System.out.println("i am main block");


  }
  
}