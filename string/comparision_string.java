package string;
import java.util.Scanner;
public class comparision_string {
    public static void main(String[] args) {
        
    
    @SuppressWarnings({ "unused", "resource" })
    Scanner s=new Scanner(System.in);
    String a,b;
    a="harshit";
    b="harshit";
    String name=new String("harshit");
    if(a==b){
        System.out.println("both are same");
    }else{
        System.out.println("both are not same");
    }
    if(a==name){
        System.out.println("both are same");
    }else{
        System.out.println("both are not same");
    }
}
}
