package finalKeyword;

// final - class : stop inherritance
// final - variable : stop assignment
// final - method : stop override


class Calc{
    public final void show(){
        System.out.println("By Jehan");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}

class AdvCal extends Calc{
//    public void show(){
//        System.out.println("By Salah");
//    }
}

public class Demo {
    public static void main(String[] args) {
        AdvCal obj = new AdvCal();
        obj.show();;
        obj.add(4,5);

    }
}
