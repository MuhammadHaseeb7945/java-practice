class A extends Thread{
  public void run(){
    for(int i=0; i<10;i++){
      System.out.println("hello");
      try{
         Thread.sleep(100);
      }
      catch(InterruptedException e){

      }
      
    }
    
  }
}
class B extends Thread{
  public void run(){
    for(int i=0; i<10;i++){
      System.out.println("hi");
      try{
         Thread.sleep(100);
      }
      catch(InterruptedException e){
        
      }
    }
  }
}

class C {
  public void run(){
   for(int i=0; i<10;i++){
      System.out.println("runnable");
      try{
         Thread.sleep(100);
      }
      catch(InterruptedException e){
      }
      }
    }
}
class D extends C  implements Runnable{
  public void run(){
   for(int i=0; i<10;i++){
      System.out.println("runnable D");
      try{
         Thread.sleep(100);
      }
      catch(InterruptedException e){
        
      }
    }}
}

public class Concept {
  public static void main(String[] args) {
    // thread means dividing the task into sub task that can run parallel 
    // we can divide it using the thread class and runnable interface 
    // thread class if we use there is issue that we cannot do multiple inheritance in it as if one class is inherited from it parent then we can not also extend it from thread class , so that why we can use the runnable interface there
    // if we use the thread class then we use the start function to start () the thread and in class we have to make function name as run () so that it will override the run() method from its parent
    // if we use the interrface of runnable then we use the key implement keyward and also we create the object or thread manually using thread class and pass that object of interface class
    
    A obj=new A();
    B obj1=new B();
    obj.start();
    obj1.start();  // ab ya sequentally exceute ho rha ha

    // runnable implement kia ha 
    D obj3= new D();
    Thread t1= new Thread(obj3);
    t1.run(); // thread bna kr usma class object dlna ha then thread ka through run method ko call krna ha
    System.out.println(Thread.currentThread());
    


  }
}
