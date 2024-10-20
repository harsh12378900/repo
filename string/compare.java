package string;
import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
        String a,b;
        a=s.nextLine();
        b=s.nextLine();
        if(a.compareTo(b)==0){
System.out.println("string are equal");
        }else{
            System.out.println("string are not equal");
        }
    }
}
