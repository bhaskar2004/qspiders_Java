package userInput;
import java.util.Scanner;
public class EmployeeDetails {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter id");
        int id=s.nextInt();
        System.out.println("enter name");
        String name=s.next();
        System.out.println("enter salary");
        double sal=s.nextDouble();
        System.out.println("enter designation");
        String designation = s.next();
        System.out.println("enter email");
        String email=s.next();
        System.out.println("enter mobile number");
        long mobNo=s.nextLong();
        System.out.println("enter years of exp");
        double exp = s.nextDouble();
        System.out.println("................................");
        System.out.println("EMPLOYEE DETAILS ");
        System.out.println("eid : "+id);
        System.out.println("name : "+name);
        System.out.println("salary : "+sal);
        System.out.println("designation : "+designation);
        System.out.println("email : "+email);
        System.out.println("mobileNUm: "+mobNo);
        System.out.println("experience : "+exp);

        System.out.println("................................");

    }

}
