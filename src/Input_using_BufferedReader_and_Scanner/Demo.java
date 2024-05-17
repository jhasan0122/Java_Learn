package Input_using_BufferedReader_and_Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");

//        InputStreamReader in=new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//        int num = Integer.parseInt(bf.readLine());

        Scanner s =new Scanner(System.in);

        int num = s.nextInt();
        System.out.println(num);

//        bf.close();

    }
}
