package ThisAndSuper;

class A{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int n){
        this();
        System.out.println("In A int");
    }
}
class B extends A{
    public B(){
        super(5);
        System.out.println("In B");
    }
    public B(int n){
        this();
        System.out.println("In B int");
    }
}
public class Demo {
    public static void main(String[] args) {
        B obj = new B(5);
    }

}
