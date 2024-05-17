package Interfaceess2;

interface  A{

    int age=44;     //final & static
    String area = "Mumbai";
     void show();
     void config();
}

interface X {
    void run();
}

interface Y extends X{

}


class B implements A,Y{

    @Override
    public void show() {
        System.out.println("In show");
    }

    @Override
    public void config() {
        System.out.println("in Config");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();;
        obj.config();

        System.out.println(A.area);

    }


}
