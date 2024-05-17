package Thread_Priority_and_Sleep;

class A extends Thread{
    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class Demo {
    public static void main(String[] args) {
        A obj1 =new A();
        B obj2 =new B();

//        System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}
