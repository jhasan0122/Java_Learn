package Exception_using_throws4;

class A{
    public void show() throws ClassNotFoundException{

            Class.forName("Calc");

    }
}
public class Demo {
    static {
        System.out.println("Class Loaded");
    }
    public static void main(String[] args)  {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
