
import java.util.Scanner;

public class hollorectengular {
    public static void main(String[] args) {
        @SuppressWarnings({ "unused" })
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int i, j;
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <=3; j++) {
                if(i==1||j==1||i==3||j==3)
                {
                    System.out.print("*");
            }
            else{
              System.out.print(" ");  
            }
                
            }
        System.out.print("\n");
        }
    }

}
