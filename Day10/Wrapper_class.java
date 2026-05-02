// hr premitive datatype ka ek wrapper class hota ha means ka j hum collection ki bat krta ha to wha pr hmra objcts use hota ha simple premitive datatype ni use hota is lia hum 
// int >>> Integer
// float >>>> Float
// exmplae ka tor pr agr hum int ma 5 store krta ha to sirf yhi value store hogi so jb object bna kr store krain ga to box ma 5 value bi ho gi lekn sth extra features bi hon ga


public class Wrapper_class {
  public static void main(String[] args) {
    int num=5 ;
    System.out.println("num" +num);
    Integer num2=num; // auto boxing// auto boxing
    int hash= num2.hashCode(num2);
    System.out.println(hash);
    System.out.println("num2" +num2);
    int num3 = num2;   // auto unboxing
    System.out.println("num3" +num3);
     
     String str="1234";
     int num5= Integer.parseInt(str);
     System.out.println(num5);

  }
}
