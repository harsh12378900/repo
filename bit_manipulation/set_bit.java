package bit_manipulation;
import java.util.Scanner;
public class set_bit {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
        int a,b,d,c,e;
        System.out.println("enter the number");
        a=s.nextInt();
System.out.println("enter the 0 and 1");
        b=s.nextInt();
        System.out.println("enter the any index 0 to 9");
        c=s.nextInt();
        d=b<<c;
        e=a|d;
        System.out.println(e);

}
}