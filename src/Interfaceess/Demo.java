package Interfaceess;

interface Computer{
    public abstract void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code. compile and run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code. compile and run : faster");
    }
}


class Developer{
    public void devApp(Computer cmp){
        cmp.code();
    }
}

public class Demo {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer navin = new Developer();
        navin.devApp(lap);
    }
}
