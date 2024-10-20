package string;
import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
        String a;
        a=s.nextLine();
        System.out.println(a.length());
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<=a.length();j++){
                System.out.println(a.substring(i,j));
            }
        }
}
}