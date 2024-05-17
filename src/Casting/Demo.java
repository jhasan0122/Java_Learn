package Casting;

class A{
    public void show1(){
        System.out.println("in A Show");
    }

}
class B extends A{
    public void  show2(){
        System.out.println("in B Show");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj =new B();    //Up casting
        obj.show1();
//        obj.show2();

        B obj1 =(B) obj;   //Down casting
        obj1.show2();



    }
}
