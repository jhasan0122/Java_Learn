package InnerClass;


// We cant do outer class static
 class A{

    int age;
    public void show(){
        System.out.println("In show");
    }
    static class B{                  //if inner class is static we dont need of outer class object
        public void config(){
            System.out.println("Config");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

//        A.B innerObj = obj.new B();
        A.B innerObj = new A.B();
        innerObj.config();
    }
}
