package recursion;
import java.util.Scanner;
public class factorial {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a,c;
    System.out.println("enter the number of a");
    a=s.nextInt();
c=prin(a);
System.out.println(c);

    
}
public static int prin(int x){
    Scanner s=new Scanner(System.in);
    int num;
    // System.out.println("enter the number");
    // num=s.nextInt();
    if(x==0){

return(1);
    }
    else{
        return(x*prin(x-1));
    }
}
    
}
