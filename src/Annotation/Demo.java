package Annotation;

@Deprecated
class A{
    public void showTheDateWhichBelongsToThisClass(){
        System.out.println("in A show");
    }
}

class B extends A{

   @Override
    public void showTheDateWhichBelongsToThisClass() {
        System.out.println("in B show");
    }
}


public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDateWhichBelongsToThisClass();
    }
}
