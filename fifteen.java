
import java.util.Scanner;

public class fifteen {
    public static void main(String[] args) {
        @SuppressWarnings({ "unused" })
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <=5; j++) {
                if(i>=j)
                {
                    int sum=i+j;
                    if(sum%2==0)
                    {
                    System.out.print(  "1"  );
                    }
                    else{
                        System.out.print("0");
                    }
                }
            else {
              System.out.print("   ");  
            }
                
            }
        System.out.print("\n");
        }
    }

}

