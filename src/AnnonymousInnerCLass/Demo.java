package AnnonymousInnerCLass;

class A{
    public void show(){
        System.out.println("In A Show");
    }
}
//class B extends A{
//    public void show(){
//        System.out.println("In B Show");
//    }
//}

public class Demo {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In new Show");
            }
        };
        obj.show();
    }
}
