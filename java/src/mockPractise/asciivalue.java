package mockPractise;
import java.util.Scanner;
public class asciivalue {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the character ");
        char c=s.next().charAt(0);
        System.out.println("the character is : "+c);
        int ascii=c;
        System.out.println("the ascii value of "+ c+ " is : "+ ascii);
    }
}
