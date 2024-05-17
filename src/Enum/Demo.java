package Enum;

enum Status{
    Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args) {

        int i = 5;
        Status s = Status.Success;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] ss =Status.values();
        for (Status sta : ss){
            System.out.println(sta + " : " + sta.ordinal() );
        }

    }

}
