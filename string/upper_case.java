package string;
import java.util.Scanner;
public class upper_case {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
        System.out.println("enter the String");
        String a;
        a=s.nextLine();
        System.out.println(a.toUpperCase() );
 
     }
}