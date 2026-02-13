package loops;
import java.util.Scanner;
public class digits {
    public static void digitsAre(int n ){
        int temp=n;
        System.out.println("the digits in the number : ");
        while (temp!=0){
            int digit=temp%10;
            System.out.println(digit);
            temp=temp/10;
        }
        System.out.println("----------------------------");
        System.out.println("the even and odd digits are : ");
        temp=n;
        int ec=0,oc=0;
        while (temp!=0){
            int digit=temp%10;
            if(digit%2==0){
                ec++;
                System.out.println("even digit : "+digit);
            }
            else {
                oc++;
                System.out.println("odd digit : "+digit);
            }
            temp=temp/10;

        }
        System.out.println("-----------------------------------");

        System.out.println("the number of even digits are : "+ec);
        System.out.println("the number of odd digits are : "+ oc);


    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a digit  :");
        int n=s.nextInt();
        digitsAre(n);


    }
}
