package mockPractise;
import java.util.Scanner;
public class largestOf3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter three numbers : ");
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        if(a>b && a>c){
            System.out.println("a is the largest num : "+ a);

        } else if ( b>a && b>c) {
            System.out.println("b is largest : "+ b);

        }else {
            System.out.println("c is largest : "+ c);
        }
    }
}
