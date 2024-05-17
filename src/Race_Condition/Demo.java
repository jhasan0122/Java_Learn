package Race_Condition;

class Counter{
    int count;
    public synchronized void incremenet(){
        count++;
    }
}

public class Demo {

    public static void main(String[] args){
        Counter c =new Counter();
        Runnable obj1 =() ->{
            for (int i = 1; i <= 10000; i++) {
                c.incremenet();
            }
        };
        Runnable obj2 =() ->{
            for (int i = 1; i <= 10000; i++) {
                c.incremenet();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            System.out.println(e.fillInStackTrace());
        }

        System.out.println(c.count);
    }
}
