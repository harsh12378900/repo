package array;
import java.util.Scanner;
import java.util.Scanner;

@SuppressWarnings("unused")
public class inisilaje {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int i,a,b;
        System.out.println("enter the value of a and b");
        a=s.nextInt();
        b=s.nextInt();
    int search[]=new int[a];
    for(i=0;i<a;i++){
        System.out.println("enter the value of  index:"+i);
        search[i]=s.nextInt();
    }
    for(i=0;i<a;i++){
        if(search[i]==b){
System.out.println("the index number of perticular number :"+i);
        }
    }
    }
}

