package array;

import java.util.Scanner;

public class print_array {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int i,a;
        System.out.println("enter the value of a");
        a=s.nextInt();
        int record[]=new int[a];
       
        for (i = 0; i <a; i++) {
            System.out.println("enter the element  index:" + i);
            record[i] = s.nextInt();

        }
        for (i = 0; i < a; i++) {
         
            System.out.println(record[i]);
        }
    }
}
