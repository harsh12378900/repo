package string;

import java.util.Scanner;

public class find_the_string_length {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
        //concatinating String uses by harshit maheshwari
        String a,b,c;
        a=s.nextLine();
        b=s.nextLine();
        c=a +"@" + b;//(" ") this is a create the space between two string
        System.out.println(c.length());//.length() function is caled that how many alphabet in string
}
}
