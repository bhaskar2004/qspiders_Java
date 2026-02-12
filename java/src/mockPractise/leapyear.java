package mockPractise;

import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter a year" );
        int year = s.nextInt();
        if((year%400 == 0) || (year % 4 ==0 && year % 100 !=0)){
            System.out.println("its a leap year : "+year);
        }
        else {
            System.out.println("not a leap year :"+ year);
        }


    }
}
