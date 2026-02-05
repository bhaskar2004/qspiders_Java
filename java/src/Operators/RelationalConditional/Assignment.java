package Operators.RelationalConditional;
import java.util.Scanner;
public class Assignment {

    public static void  examResult(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter your marks");
        double score=s.nextDouble();
        String  res = score>=40 ? "pass" : "fail";
        System.out.println(res);
    }

    public static void vote(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter you age ");
        int age=s.nextInt();
        String res=age>=18?"Eligible to vote ":"Not eligible ";
        System.out.println(res);

    }

    public static void  bill(){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the Bill ");
        double amt = s.nextInt();
        amt = amt>=5000?amt-(amt*0.1):amt;
        System.out.println("the bill is : "+ amt);
    }

    public static void emp(){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the experience ");
        double exp = s.nextDouble();
        String  bonus=exp>5?"bonus 10,000":"no bonus";
        System.out.println(bonus);
    }

    public static void exam(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the attendance : ");
        int attendance=s.nextInt();
        String res = attendance>=75?"access":"denied";
        System.out.println(res);
    }

    public static void main(String[] args) {
        examResult();
        vote();
        bill();
        emp();
        exam();

    }
}
