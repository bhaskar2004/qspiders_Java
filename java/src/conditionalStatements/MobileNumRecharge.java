package conditionalStatements;
import javax.security.sasl.SaslClient;
import java.util.Scanner;
public class MobileNumRecharge {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long number=9874563210L;
        System.out.println("enter the mobile number");
        long n=s.nextLong();
        if(number==n){
            System.out.println("enter the recharge amount");
            int rechargeAmt=s.nextInt();
            if(rechargeAmt<50){
                System.out.println("Minimum recharge not allowed");
            } else if (rechargeAmt>5000) {
                System.out.println("Recharge limit exceeded");
            }else {
                System.out.println("Recharge successfil");
            }

        }else {
            System.out.println("invalid mobile number");
        }
    }
}
