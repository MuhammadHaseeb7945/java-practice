// lamda expression only work with functional interface 
// isma new class ni banni prti or extra code bi ni likhna prta
//agr parameter pass kr rha hon to types optional bi bn jati ha agr simple one line statement ho to { } optional ho jati ha
// agr return statement lga rha ho to brakets lgani ha wrna ni


@FunctionalInterface
interface A {
  // by default public abstract
  void display();

  
}
@FunctionalInterface
interface B {
int add(int a,int b);
  
}
public class Lamda_expression {
  public static void main(String[] args) {
    A obj=()->{
        System.out.print("hellow");
      };
    
    obj.display();
    
    B obj2= (a,b)->  a+b;
    System.out.print(obj2.add(2,4));
  }
}
