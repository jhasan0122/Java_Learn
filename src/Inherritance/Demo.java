package Inherritance;

public class Demo {
    public static void main(String[] args) {
        veryAdvCalc obj = new veryAdvCalc();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(7,3);
        int r3 = obj.multi(7,3);
        int r4 = obj.div(7,3);
        double r5 = obj.power(7,3);

        System.out.println(r1 + " " + r2+" "+r3 + " " + r4+ " " + r5);
    }
}
