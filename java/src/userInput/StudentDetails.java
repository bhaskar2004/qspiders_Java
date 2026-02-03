package userInput;
import java.util.Scanner;
public class StudentDetails {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter student name :");
        String name=s.next();
        System.out.println("enter USN :");
        String usn=s.next();
        System.out.println("enter Branch :");
        String branch=s.next();
        System.out.println("enter CGPA :");
        double cgpa=s.nextDouble();
        System.out.println("enter mobile number : ");
        long mob=s.nextLong();

        System.out.println("----------------------------");
        System.out.println("STUDENT DETAILS");
        System.out.println("----------------------------");

        System.out.println("name : "+ name);
        System.out.println("USN : "+usn);
        System.out.println("Branch : "+ branch);
        System.out.println("CGPA : "+cgpa);
        System.out.println("mobile number : "+mob);
        System.out.println("----------------------------");



    }

}
