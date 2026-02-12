package loops;
import  java.util.Scanner;
public class WhileLoop {
    public static void evenN_1(int n){
        System.out.println("----------------------------------");
        System.out.println("even numbers from N to 1");
        while (n>=1){
            if(n%2==0){
                System.out.println(n);
            }
            n--;
        }
        System.out.println("-----------------------------------");
    }
    public static void odd1_N(int n){
        System.out.println("----------------------------------");
        System.out.println("odd numbers from 1 to N");
        int i=1;
        while (i<=n){
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println("----------------------------------");

    }

    public static void numM_N(int m,int n){
        System.out.println("----------------------------------");
        System.out.println("numbers from M to N");
        while (m<=n){
            System.out.println(m);
            m++;
        }
        System.out.println("----------------------------------");
    }

    public static void evenM_n(int m,int n){
        System.out.println("----------------------------------");
        System.out.println("even numbers from M to N");
        while (m<=n){
            if(m%2==0){
                System.out.println(m);
            }
            m++;
        }
        System.out.println("---------------------------------");
    }

    public static void oddM_n(int m,int n){
        System.out.println("----------------------------------");
        System.out.println("odd numbers from M to N");
        while (m<=n){
            if(m%2!=0){
                System.out.println(m);
            }
            m++;
        }
        System.out.println("---------------------------------");
    }

    public static void evenN_M(int m,int n){
        System.out.println("----------------------------------");
        System.out.println("even numbers from N to M");
        while (n>=m){
            if(n%2==0){
                System.out.println(n);
            }
            n--;
        }
        System.out.println("---------------------------------");
    }

    public static void oddN_M(int m,int n){
        System.out.println("----------------------------------");
        System.out.println("odd numbers from N to M");
        while (n>=m){
            if(n%2!=0){
                System.out.println(n);
            }
            n--;
        }
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter m and n value");
        int m=s.nextInt(),n=s.nextInt();
        evenN_1(n);
        odd1_N(n);
        numM_N(m,n);
        evenM_n(m,n);
        oddM_n(m,n);
        evenN_M(m,n);
        oddN_M(m,n);
    }

}