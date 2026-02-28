package loops;
import java.util.Scanner;
public class spyNumber {

    public static boolean spy(int n ){ // the sum of digits == product of digits
        int sum=0,product=1;
        while (n!=0){
            int digit = n % 10;
            sum+= digit;
            product*=digit;
            n/=10;
        }
        return sum == product;

    }

    public static void allSpyNum(){
        int count=0;
        for(int i =10;i<=1000000000;i++){
            int sum=0,prod=1;
            int j=i;

            while (j!=0){
                int digit = j % 10;
                sum+=digit;
                prod*=digit;
                j/=10;
            }
            if(sum==prod){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("the total number of spy numbers from 1 to 1000000000  "+ count);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("enter a number ");
//        int n = s.nextInt();
//        System.out.println(spy(n)?n+" is a spy number ": n+" is not a spy number");
        allSpyNum();
    }

}
