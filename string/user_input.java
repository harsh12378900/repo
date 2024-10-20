package string;
import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string");
String a,b;
a=s.next();
b=s.nextLine();
System.out.println(a);
System.out.println(b);
    }
}
