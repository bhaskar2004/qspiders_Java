package loops;
import java.util.Scanner;

public class Counter {

    public static void count1_N(int n){
        int count =0,i=1;
        while(i<=n){
            count++;
            i++;
        }
        System.out.println("the count from 1 to N is : "+ count );

    }
    public static void evenOddCount1_N(int n){
        int ec=0,oc=0,i=1;
        while (i<=n){
            if(i%2==0){
                ec++;
            }else {
                oc++;
            }
            i++;
        }
        System.out.println("the even count is : "+ec+ " and odd count is : "+ oc);
    }

    public static void countM_N(int m , int n){
        int count=0;
        while (m<=n){
            count++;
            m++;
        }
        System.out.println("the count from M to N is :"+count);
    }
    public static void countEvenOddM_n(int m,int n){
        int ec=0,oc=0;
        while (m<=n){
            if(m%2==0){
                ec++;
            }
            else {
                oc++;
            }
            m++;
        }
        System.out.println("the even count from M to N is : "+ ec+" and odd count is : "+oc);
    }

    public static void countsN_M(int m,int n){
        int ec=0,oc=0;
        while (n>=m){
            if(n%2==0){
                ec++;
            }
            else {
                oc++;
            }
            n--;
        }
        System.out.println("the count from N to M is :"+ (ec+oc));
        System.out.println("the even count from N to M is : "+ ec + " and odd count is : "+ oc);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter n value :");
        int n=s.nextInt();
        count1_N(n);
        evenOddCount1_N(n);
        System.out.println("enter m value :");
        int m=s.nextInt();
        countM_N(m,n);
        countEvenOddM_n(m,n);
        countsN_M(m,n);

    }
}
