package Encapsulation;

class Human{
    private int age;
    private String name;

    public Human(){
        age = 12 ;
        name = "Jhon";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age /* ,Human slefObj */){
        this.age = age;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(11);
        obj.setName("jehan");

        System.out.println(obj.getName() + " : "+obj.getAge());

        System.out.println(new Human(22,"Hasan").getAge());


    }
}
