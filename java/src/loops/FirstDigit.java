package loops;

import java.util.Scanner;
public class FirstDigit {

    public static int firstDigit(int n ){

        while (n>9){
            n/=10;
        }
        return n%10;

    }

    public static int secondDigit(int n){

        while (n>99){
            n/=10;
        }
        return n%10;

    }
    public static int nthDigit(int n,int m){
        int key=1;
        while (m!=0){
            key=key*10;
            m--;
        }
//        System.out.println("k "+ key);
        while (n>key-1){
            n/=10;
        }
        return n%10;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = s.nextInt();
        System.out.println("first digit of the number "+ n +" is "+firstDigit(n));
        System.out.println("second digit of the number "+n+" is "+secondDigit(n));
        System.out.println("enter the n th value");
        int m = s.nextInt();
        System.out.println("nth digit is : "+ nthDigit(n,m));
    }

}
