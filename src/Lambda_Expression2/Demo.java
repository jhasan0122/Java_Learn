package Lambda_Expression2;

public class Demo {
    @FunctionalInterface
    interface A{
        int add(int i,int j);
    }
    public static void main(String[] args) {
       A obj = (i,j) -> i+j;

       int result = obj.add(5,3);
        System.out.println(result);
    }
}
