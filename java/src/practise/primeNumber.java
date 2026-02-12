package practise;
import java.util.Scanner;
public class primeNumber {
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void megaPrime(int n){
        if(!isprime(n)){
            System.out.println("is not mega prime");
        }
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            if(digit==2 && digit==3 && digit==5 && digit==7){
                System.out.println("is not mega prime");
                return;
            }
            temp=temp/10 ;
        }
        System.out.println("is a mega prime number");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        System.out.println(isprime(n));
        megaPrime(n);
    }
}
