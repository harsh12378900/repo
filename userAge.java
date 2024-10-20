import java.util.Scanner;
public class userAge{
    public static void main(String[] args) {
        System.out.println("enter the age ");
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int age;
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("this is a adult");
        }
        else
        {
            System.out.println("this is a not adult");
        }

    }
    }
    
