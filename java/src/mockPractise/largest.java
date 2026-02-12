package mockPractise;
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter two numbers ");
        int a=s.nextInt(),b=s.nextInt();
        String res = a>b ? "a is largest "+a : "b is largest "+b;
        System.out.println(res);
    }

}
