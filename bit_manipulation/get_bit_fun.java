package bit_manipulation;
import java.util.Scanner;
public class get_bit_fun {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
        int a,b,d,c;
        System.out.println("enter the number");
        a=s.nextInt();
System.out.println("enter the 0 and 1");
        b=s.nextInt();
        System.out.println("enter the any index 0 to 9");
        c=s.nextInt();
        
        d=b<<c;
        System.out.println(d);
        if((a&d)!=0){
            System.out.println("Bit was one ");
        }else{
            System.out.println("bit was Zero");
        }

    }
}
