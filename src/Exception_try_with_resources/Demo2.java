package Exception_try_with_resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        int i=0;
        int j=0;
        int num=0;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);

        }
//        catch (Exception e){
//            System.out.println("Something went wrong");
//        }
        finally {
            System.out.println("Bye");
            br.close();
        }
    }
}
