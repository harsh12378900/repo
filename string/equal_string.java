package string;
import java.util.Scanner;
public class equal_string {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string a and b");
    String a,b;
    a=s.nextLine();
    b=s.nextLine();
    String name=new String("harshit");
    if(a.equals(b)){// .equal  
        System.out.println("both are same value");
    }else{
        System.out.println("both are not same value");
    }
    if(a.equals(name)){
        System.out.println("both are same value");
    }else{
        System.out.println("both are not same value");
    }
}
    }

