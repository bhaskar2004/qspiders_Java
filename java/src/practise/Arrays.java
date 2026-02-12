package practise;
import java.util.Scanner;
public class Arrays {
    public static void reverse(int[]a,int start,int end){
        while(start<end){
            int t=a[start];
            a[start]=a[end];
            a[end]=t;
            start++ ;
            end--;
        }
    }
    public static void main(String[] args) {

        int[]a={1,2,3,4,5,6};
        int mid=a.length/2;
        reverse(a,0,mid-1);
        reverse(a,mid,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }


}



