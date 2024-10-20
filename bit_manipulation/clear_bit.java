package bit_manipulation;
import java.util.Scanner;
public class clear_bit {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int number;
        number=s.nextInt();
        //1 taking a bit but we are taking a bit 1 then this is clear a perticular number
        System.out.println("enter the index number");
        int index;
        index=s.nextInt();
        int newnumber=1<<index;
        int a=~(newnumber);
        int bitmass=a&number;
        System.out.println(bitmass);
    }
}
