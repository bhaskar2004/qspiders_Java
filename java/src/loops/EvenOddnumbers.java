package loops;

import java.util.Scanner;

public class EvenOddnumbers {

    public static void even(int s , int n){
        System.out.println("even numbers : ");
        while (n!=0){
            if(s%2==0){
                System.out.println(s);
                n--;
            }
            s++;
        }
    }

    public static void odd(int s , int n){
        System.out.println("odd numbers : ");
        while (n!=0){
            if(s%2!=0){
                System.out.println(s);
                n--;
            }
            s++;
        }
    }

    public static void primeNum(int s , int n){
        while (n!=0){
            int count=0;
            for (int i =2;i<=s/2;i++){
                if(s% i==0){
                    count++;
                }

            }
            if(count==0){
                System.out.println(s);
                n--;
            }
            s++;


        }
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a start number and number of numbers ");
        int s=in.nextInt(),n=in.nextInt();
//        even(s,n);
//        odd(s,n);
        primeNum(s,n);
    }

}
