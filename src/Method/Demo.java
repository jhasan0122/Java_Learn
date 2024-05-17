package Method;

class Computer {
    public void playMusic(){
        System.out.println("Music plying");
    }

    public String getMePen(int cost){
        return "Pen";
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer obj =new Computer();
        obj.playMusic();
        System.out.println(obj.getMePen(10));

    }
}
