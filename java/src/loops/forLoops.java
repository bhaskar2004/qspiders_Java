package loops;
import java.util.Scanner;
public class forLoops {

    public static void numbers1_n(int n){
        System.out.println("numbers ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);

        }
    }

    public static void evenNum1_N(int n){
        System.out.println("even numbers");
        for (int i =1;i<=n;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void oddNum1_N(int n){
        System.out.println("odd numbers");
        for (int i =1;i<=n;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void Digits(int num){
        System.out.println("digits ");
        for (int i =num; i!=0 ; i/=10){
            int digit = i % 10;
            System.out.println(digit);

        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter n value");
        int n=s.nextInt();
        numbers1_n(n);
        evenNum1_N(n);
        oddNum1_N(n);
        System.out.println("enter a number");
        int num=s.nextInt();
        Digits(num);

    }

}
