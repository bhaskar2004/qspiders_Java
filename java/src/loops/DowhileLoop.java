package loops;

import java.util.Scanner;

public class DowhileLoop {

    public static void numbers1_N(int n){
        int i =1;
        System.out.println("numbers from 1 to N");
        do{
            System.out.println(i);
            i++;
        }while (i<=n);
    }

    public static void evenOdd1_N(int n){
        int i =1;
        System.out.println("even numbers and odd numbers");
        do{
            if(i % 2 == 0){
                System.out.println(" even number : "+ i);
            }
            else {
                System.out.println(" odd number : " +i);
            }
            i++;
        }while (i<=n);
    }

    public static void digits(int num){
        do{
            int digits=num%10;
            System.out.println(digits);
            num/=10;
        }while (num !=0);
    }

    public static void even(int n ){
        for (int i = 1; i <=n ; i+=2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = s.nextInt();
//        numbers1_N(n);
//        evenOdd1_N(n);
        even(n);
//        System.out.println("enter the number : ");
//        int num=s.nextInt();
//        digits(num);
    }

}
