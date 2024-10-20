package recursion;
import java.util.Scanner;
public class fabonacci_series {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        System.out.println("enter the value of a");
        a=s.nextInt();
        fabbi(a);
    }
    public static void fabbi(int x){
        if(x==0){
            return(0);
        }
        if(x==1){
            return(1);

        }
        
    }
}
