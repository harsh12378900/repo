

package advancePattern;
import java.util.Scanner;

public class butterflyPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number a and b");
int a,b,i,j;
a=s.nextInt();
b=s.nextInt();
for(i=1;i<=a;i++){
    for(j=1;j<=b;j++){
        if(i>=j){
            System.out.print("*");
        }
        else{
            System.out.print("  ");
        }
    }
    System.out.print("\n");
}
for(i=a;i>=1;i++){
    for(j=1;j<=b;j++){
        if(i<=j&&j<=4-1){
            System.out.print("*");
        }
        else{
            System.out.print("  ");
        }
    }
    System.out.print("\n");
}


    }
    
}
