package Enum;


public class Demo2 {
    public static void main(String[] args) {
        Status s =Status.Success;

        switch (s){
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
        }

//        if(s == Status.Running){
//            System.out.println("All Good");
//        }
//        else if(s == Status.Failed){
//            System.out.println("Try Again");
//        } else if (s==Status.Pending) {
//            System.out.println("Please wait");
//        }
//        else{
//            System.out.println("Done");
//        }
    }
}
