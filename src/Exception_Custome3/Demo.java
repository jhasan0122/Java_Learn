package Exception_Custome3;

class jehanException extends Exception{
    public jehanException(String str){
        super(str);
    }
}

public class Demo {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
             j = 18/i;
             if(j==0){
                 throw new jehanException("I dont want to print zero");
             }

        }catch (jehanException e){
            j=18/1;
            System.out.println("Thats the default output" + e);
//            System.out.println("Can't divide by zero" + e);
        }
        catch (Exception e){
            System.out.println("Something is wrong" + e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
