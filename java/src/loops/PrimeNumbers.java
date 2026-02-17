package loops;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;
 public class PrimeNumbers {

     public static void factors(int n ){
         System.out.println("---------------------------");
         System.out.println("factors of "+ n + " : ");
         int count = 0,sum=0;
         for (int i=1;i<=n;i++){
             if(n%i==0){
                 count++;
                 sum+=i;
                 System.out.println(i);
             }
         }
         System.out.println("the count of factors is : "+ count);
         System.out.println("the sum od factors is : "+ sum);
     }

     public static void primeNumbers(int n){
         System.out.println("-----------------------------");
         System.out.println("checking the "+ n + " is prime or not ");
         int count=0;
         for (int i=1;i<=n;i++){
             if(n%i==0){
                 count++;
             }
         }
         System.out.println(count==2?n + " is a prime number ": n+ " is not prime number ");
     }

     public static void perfectNumber(int n){
         System.out.println("---------------------------------");
         System.out.println("PERFECT NUMBER ?");
         int sum=0;
         for(int i =1;i<=n/2;i++){
             if(n%i==0){
                 sum+=i;
             }
         }
         System.out.println(sum==n ? n+" is a perfect number ": n+ " is not perfect number ");
     }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter n value");
        int n=s.nextInt();
        factors(n);
        primeNumbers(n);
        perfectNumber(n);

    }
}
