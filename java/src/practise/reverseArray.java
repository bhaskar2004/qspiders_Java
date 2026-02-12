package practise;

public class reverseArray {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int[]b=new int[a.length];
        int s=0,e=a.length-1;
//        while(s<e){
//            int t=a[s];
//            a[s]=a[e];
//            a[e]=t;
//            s++;
//            e--;
//        }
        for(int i=0;i<a.length;i++){
            b[i]=a[a.length-i-1];
        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }

    }
}
