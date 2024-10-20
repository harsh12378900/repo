import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
        @SuppressWarnings("unused")
        int a,b,c;
        a=s.nextInt();
        if(a==1)
         {
           System.out.println("hello"); 

        }
        else if(a==2)
        {
            System.out.println("namaste");
        }
        else if(a==3)
        {
            System.out.println("bonjour");
        }
        else
        {
            System.out.println("this number is not valid");
        }

    }
}
