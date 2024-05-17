package Stat;

class Mobile{
    String brand;
    int price;
    String network;
    static String name;

    static {
        name = "Phone";
        System.out.println("In static block");
    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void show(){
        System.out.println(brand + " : "+price+" : "+name);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : "+obj.price+" : "+name);
    }

}

public class Demo {
    public static void main(String[] args){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "SmartPhone";

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
//        Class.forName("Mobile");

    }
}
