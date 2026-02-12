package conditionalStatements;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in );
        int bal=15000;
        int pin=1234;
        System.out.println("enter the pin ");
        int p=s.nextInt();
        if(pin==p){

            System.out.println("enter the withdraw amount");
            int amt=s.nextInt();
            if(bal<500){
                System.out.println("in sufficent balance");
            } else if (amt>bal) {
                System.out.println("invalid withdraw amount");
            } else if (amt>20000) {
                System.out.println("exceeding limit");
            }else {
                bal=bal-amt;
                System.out.println("transaction successfull !");
                System.out.println("the remaining balance is : "+bal);
            }


        }else {
            System.out.println("invalid pin please try again");
        }

    }

}
