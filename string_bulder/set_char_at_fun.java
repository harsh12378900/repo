package string_bulder;
import java.util.Scanner;
public class set_char_at_fun {
    public static void main(String[] args) {
        @SuppressWarnings({ "unused", "resource" })
        Scanner s=new Scanner(System.in);
        
        StringBuilder a=new StringBuilder("harsh");
        a.setCharAt(4, 'n');
        System.out.println(a);
       

    }
}
