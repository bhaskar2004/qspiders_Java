package practise;
import java.util.Scanner;
public class cyclicPrime {

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

    public static void cyclic(int n){
        if(!isprime(n)){
            System.out.println("is not cyclic prime number");
            return;
        }
        int temp=n;
        int count=(int)Math.log10(n)+1;
        for(int i=1;i<count;i++){

            int digit=temp%10;
            int remainingDigits=temp/10;

            temp=(int) (digit * Math.pow(10,count-1) + remainingDigits);
            if(!isprime(temp)){
                System.out.println("not a cyclic number");
                return;
            }

        }
        System.out.println("is a cyclic prime number");


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        cyclic(n);
    }
}
