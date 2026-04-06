class Student{
  String name;
  int marks;
}
// so is full code ka under hum na sbsa pehla ek class bnyii then uska object bnya then un object ko array ma pass kia then unko array ka through iterte kia that simple 
public class Array_of_Object {
  public static void main(String[]arg){
  Student std= new Student();
  std.name="Haseeb";
  std.marks =100;

  Student std1= new Student();
  std1.name="Akbar";
  std1.marks =98;

  Student std2= new Student();
  std2.name="Mani";
  std2.marks =90;

  Student arr1[]={std,std1,std2};
  for(Student n:arr1){
     System.out.println(n.name +" : " + n.marks);

  }
  System.out.println();

  for (int i=0;i<arr1.length;i++){
    System.out.println(arr1[i].name + " : " + arr1[i].marks);
    
  }
    
  }
}
