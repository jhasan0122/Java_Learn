package MethodOverriding;

class A{
    public void show(){
        System.out.println("In A show");
    }
    public void config(){
        System.out.println("In A Config");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}
