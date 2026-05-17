
record Good(int i, String j) {
  public Good{
    if(i<0){
    throw new IllegalArgumentException("i cannot be null");
  }}
}
public class Record_class {
  public static void main(String[] args) {
    Good obj= new Good(1, "Haseeb");
     Good obj1= new Good(10, "Haseeb");
     System.out.println(obj.equals(obj1)); // automatically content comapre krta ha record
     // record ma data o hum change ni kr skta so thats why it is used for data preocessong
     // by default finl class hota ha 
     // agr koi fetch krna chaoo to direct kr skta ho jesa ka obj.i or obj.j
     // object comapre krna hot to direct backedn pr tostring or hash function equak kud kr deta ha dosri classes ki trh hum ni krnaa prta 
     // udr use kro jdr apna data ko just temporary store krna ho sirf watch ka lia na koi update wegra perfrom krna ka lia
      System.out.println(obj==obj1);
    
      
  }
}
