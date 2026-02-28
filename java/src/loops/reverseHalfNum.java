package loops;
import java.util.Scanner;
public class reverseHalfNum {

    public static int count(int n){
        //returns the total number of digits present in the number
        int count =0 ;
        while (n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int reverse(int n){
        int reverse=0;
        int count=count(n);
        while (count!=0){
            int last=n%10;
            reverse=reverse*10+last;
            count--;
            n/=10;

        }
        return reverse;
    }

    public static void revlasthalf(int n){
        System.out.println("reversing the lasthalf : ");
        int count=(count(n))/2;  // to get the half count
        int reverse=0, temp=n;
        while (count>0){
            int digit=temp%10;  //gets the last digit from the number
            reverse = reverse * 10 + digit;   // reverse the digits
            temp/=10;
            count--;
        }
        count=(count(n))/2;
        while (count!=0){  // make the remaining number to 100's pleace
            temp*= 10 ;
            count--;
        }
        temp=temp+reverse; // concatenate the numbers
        System.out.println(temp);
        System.out.println(" ");
    }


    public static void firstHalf(int n ){
        System.out.println("reversing the first half  :");
        int count=(count(n))/2;  // to get the half count
        int temp=n,lh=0;
        while (count!=0){
            int digit=temp%10;
            lh=lh*10+digit;
            temp/=10;
            count--;
        }
        int l=reverse(lh);
        count=(count(n))/2;
        int firsthalfRev=reverse(temp);
        while (count!=0){
            firsthalfRev=firsthalfRev*10;
            count--;

        }
        System.out.println(firsthalfRev+l);
    }

    public static void reverseFull(int n){
        System.out.println("full number reversed : ");
        int count=count(n)/2;
        int c=count;
        int temp=n,N=n;
        int mid =0;
        if(count % 2 !=0 ){
            count=count+1;
        }

        while (count+1!=0){
            mid=temp%10;
            temp=temp/10;
            count--;
        }
        System.out.println("mid value is : "+ mid);
        int lh=0;
        while (c!=0){
            int digit=n%10;
            lh=lh*10+digit;
            n/=10;
            c--;
        }
        System.out.println("last digit "+lh);
        int reverseofFirsthalf=reverse(temp);
        count = count(temp)+1;
        while (count!=0){
            reverseofFirsthalf= reverseofFirsthalf*10;
            count--;
        }
        count = count(temp);
        while (count>0){

            mid= mid*10;
            count--;
        }
        reverseofFirsthalf= reverseofFirsthalf+ mid+lh;
        System.out.println(reverseofFirsthalf);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number ");
        int n =s.nextInt();
//        revlasthalf(n);
//        firstHalf(n);
        reverseFull(n);
    }

}
