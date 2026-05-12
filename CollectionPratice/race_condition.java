class Counter{
  int count;
  public void increment(){
    count++;
  }
}

public class race_condition {
  public static void main(String[] args) throws InterruptedException{
    // race codition occur when two threads trying to  modify the one resources at the same time and inconsistently occur thats call the race condtion so we must have to synchronize the function or method to complete on after another and no impact on each other
    // so agr race condition occur ho to method ka sth synchronized lga dain to wo synchronized way ma kam kra ga

    Counter obj= new Counter();
    Thread t1=new Thread(()->{
      for(int i=0;i<1000;i++){
        obj.increment();
      }
    });
    Thread t2=new Thread(()->{
      for(int i=0;i<1000;i++){
        obj.increment();
      }
    });
    System.out.println(t1.getState()); // new state create kra ga
    t1.start();
    System.out.println(t1.getState()); // runnable state bnata ha 
    t2.start();
    Thread.sleep(1000);
     System.out.println(t2.getState());
    t1.join();      // main thread w8  krta ha jb tk dono threads complete na ho jain
    System.out.println(t1.getState());// terminated state
    t2.join();
    
    System.out.println(t1.getState());
     System.out.println(obj.count);
    }

  }

