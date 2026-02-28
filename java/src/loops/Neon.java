package loops;

import java.util.Scanner;

public class Neon {
    public static boolean isNeon(int n){
        int sq=n*n,sum=0;
        while (sq!=0){
            int digit=sq%10;
            sum+=digit;
            sq/=10;
        }
        return n==sum;
    }

    public static void neonNumbers(){
        for(int i = 1;i<1000000000;i++){ //only 1 and 9 are neon number from 1 to 1000000000 ;
            int sq=i*i,sum=0;
            while (sq!=0){
                int digit = sq %10;
                sum+=digit;
                sq/=10;
            }
            if(sum == i){
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("enter a number ");
//        int n = s.nextInt();
//        System.out.println(isNeon(n)?n+" is a neon number " : n+ " is not neon number ");
        neonNumbers();
    }
}
