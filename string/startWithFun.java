package string;

import java.util.Scanner;

public class startWithFun {
     public static void main(String[] args) {
       @SuppressWarnings("resource")
      Scanner s=new Scanner(System.in);
       System.out.println("enter the String");
       String a,b;
       a=s.nextLine();
       b=s.nextLine();
       System.out.println(a.startsWith(b) );

    }
}
