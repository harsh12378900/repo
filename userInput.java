import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;

        System.out.println("the input number is "+c);


    }

}
