package array;
import java.util.Scanner;
public class minimum {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        @SuppressWarnings("unused")
        int i,a,b;
        System.out.println("enter the value of a and b");
        a=s.nextInt();
        b=s.nextInt();
    int max[]=new int[a];
    max[0]=0;
    for(i=0;i<a;i++){
        System.out.println("enter the value of  index:"+i);
        max[i]=s.nextInt();
    }
    for(i=0;i<a;i++){
        if(max[i]>max[0]){
            max[0]=max[i];

        }
    }
    System.out.println("the maximum number  :"+max[0]);
    }
}



