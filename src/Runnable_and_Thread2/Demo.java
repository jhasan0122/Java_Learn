package Runnable_and_Thread2;

class Z{

//}
//class A implements Runnable{
//    public void run(){
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}class B implements Runnable{
    public void run(){
        for (int i = 1; i <= 5; i++) {
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
        Runnable obj1 =new Runnable() {
            @Override
            public void run(){
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Runnable obj2 =new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();

        t2.start();
    }
}
