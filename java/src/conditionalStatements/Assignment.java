package conditionalStatements;
import java.util.Scanner;
public class Assignment {

    public void temp(int t){
        if(t>40){
            System.out.println("Very hot");
        } else if (t<=40 && t>=30) {
            System.out.println("Hot");
        } else if (t<=29 && t>=20) {
            System.out.println("Normal");
        }else {
            System.out.println("cold");
        }
    }

    public void bill(int b){
        double bill=0;
        if(b>=5000){
            bill=b-(b*0.3);
            System.out.println("you got 30% discount and the bill is : "+bill);
        } else if (b>=3000 && b<=4999) {
            bill=b-(b*0.2);
            System.out.println("yoiu got 20% discount and the bill is : "+bill);
        }else if (b>=1000 && b<=2999){
            bill=b-(b*0.1);
            System.out.println("you got 10% discount and the bill is : "+bill);
        }else {
            System.out.println("no discount the bill is : "+ b);
        }
    }

    public void electricBill(double u){
        if(u<=100){
            System.out.println("the total bill is "+(u*1));
        } else if (u>100 && u<=200) {
            System.out.println("the totla bill is : "+ (u*2));
        } else if (u>200 && u<=300) {
            System.out.println("the total bill is : "+(u*3));

        }else {
            System.out.println("the total bill is :"+(u*5));
        }

    }

    public void increment(int i){
        double bonus=0;
        if(i==5){
            bonus=i+(i*0.3);
            System.out.println("you got 30% increment and the salay  is : "+bonus);
        } else if (i==4 ) {
            bonus=i+(i*0.2);
            System.out.println("yoiu got 20% increment and the bill is : "+bonus);
        }else if (i==3){
            bonus=i+(i*0.1);
            System.out.println("you got 10% increment and the bill is : "+bonus);
        }else {
            System.out.println("no discount the bill is : "+ i);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Assignment a=new Assignment();
        System.out.println("enter the temperature");
        int t= s.nextInt();
        a.temp(t);
        System.out.println("enter the bill");
        int b= s.nextInt();
        a.bill(b);
        System.out.println("enter total units consumed ");
        double u=s.nextDouble();
        a.electricBill(u);
        System.out.println("enter the rating");
        int r=s.nextInt();
        a.increment(r);


    }


}
