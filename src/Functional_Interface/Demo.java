package Functional_Interface;


@FunctionalInterface
interface A{
    void show();
//    void run();
}

//class B implements A{
//    @Override
//    public void show() {
//        System.out.println("in Show");
//    }
//}
public class Demo {
    public static void main(String[] args) {
        A obj =new A() {
            @Override
            public void show() {
                System.out.println("in Show");
            }
        };
        obj.show();
    }
}
