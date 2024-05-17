package Exception_Handling;

public class Demo {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        String str=null;

        int num[] = new int[5];

        try {
             j = 18/i;
            System.out.println(str.length());
            System.out.println(num[1]);
            System.out.println(num[5]);
        }catch (ArithmeticException e){
            System.out.println("Can't divide by zero" + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }
        catch (Exception e){
            System.out.println("Something is wrong" + e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
