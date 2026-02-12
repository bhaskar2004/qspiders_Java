package mockPractise;
import java.util.Scanner;
public class userInput {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a= in.nextInt();
        System.out.println("enter value of b");
        int b=in.nextInt();
        System.out.println("the sum of "+a+ " + "+ b+" = " +(a+b));
    }

}
