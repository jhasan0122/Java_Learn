package Method_overloading;

class Calculator{

    int num = 5;

    public int add(int n1,int n2){
        return n1 + n2;
    }
    public int add(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1,double n2,double n3){
        return n1 + n2 + n3;
    }
}



public class Demo {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        int r1 = obj.add(3,4);
        int r2 = obj.add(3,4,8);

        System.out.println(r1);
        System.out.println(r2);


        Calculator obj1 =new Calculator();
        obj1.num = 10;
        System.out.println(obj1.num);

        Calculator obj2 =new Calculator();
        System.out.println(obj2.num);

    }
}
