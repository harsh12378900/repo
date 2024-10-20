
import java.util.Scanner;

public class tringle {
    public static void main(String[] args) {
        @SuppressWarnings({ "unused" })
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int i, j;
        for (i = 4; i >=1; i--) {
            for (j = 1; j <=4; j++) {
                if(i>=j)
                {
                    System.out.print("* ");
            }
            else{
              System.out.print(" ");  
            }
                
            }
        System.out.print("\n");
        }
    }

}

