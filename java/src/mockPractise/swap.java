package mockPractise;
import java.util.Scanner;
public class swap {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter two numbers ");
        int a=s.nextInt(),b=s.nextInt();
        System.out.println("values before swap a = "+a+" and b = "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("values after swap a = "+a+" and b = "+b);
    }

}
