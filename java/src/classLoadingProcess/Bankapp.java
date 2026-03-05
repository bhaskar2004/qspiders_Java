package classLoadingProcess;

import java.util.Scanner;

public class Bankapp {
    static float balance=1000;
    static {
        System.out.println("welcome to the banking application");
        System.out.println("enter 1 . check balance");
        System.out.println("enter 2 . add amt");
        System.out.println("enter 3 . to withdraw amt");
    }
    public static void displayBal(){
        System.out.println(balance);
    }
    public static void addAmt(int amt){
        balance+=amt;


    }
    public static void withdraw(int amt){
        if(balance>amt) {
            balance -= amt;
        }
        else {
            System.out.println("insufficient balance");
        }

    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while (true) {

            System.out.println("enter your choice ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    displayBal();
                    break;
                case 2:
                    System.out.println("enter the amt ");
                    int amt = s.nextInt();
                    addAmt(amt);
                    System.out.println("amt added successfully");
                    break;
                case 3:
                    System.out.println("enter the amt to withdraw");
                    amt = s.nextInt();
                    withdraw(amt);
                    System.out.println("amt withdraw successfully");
                    break;

            }
        }

    }
}
