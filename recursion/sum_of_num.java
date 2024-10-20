package recursion;
import java.util.Scanner;
public class sum_of_num {
    public static int b(int z){
      if(z==1){
        return(1);
      }
      else{
        return(z+b(z-1));
      }
      
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a,x;
        
        a=s.nextInt();
x=b(a);
System.out.println(x);
    }
}
