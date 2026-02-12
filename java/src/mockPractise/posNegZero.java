package mockPractise;
import java.util.Scanner;
public class posNegZero {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter a number ");
        int n = s.nextInt();
        if(n>0){
            System.out.println("positive number :" + n);

        } else if (n<0) {
            System.out.println("negative Number : "+ n);

        }else {
            System.out.println("number = to 0 ");
        }
    }
}
