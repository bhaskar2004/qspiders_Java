public class reverseArray {
    public void diiArr(int[]a,int[]b){
        System.out.println("using different arr");
        for(int i=4;i>=0;i--){
            b[4-i]=a[i];
        }
        for(int i =0;i<5;i++){
            System.out.println(b[i]);
        }
    }

    public void sameArr(int []a){
        System.out.println("using same array");
        for(int i=4;i>=0;i--){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a= new int[5];
        int[] b=new int[5];
        a=new int[]{1,2,3,4,5};
        reverseArray r = new reverseArray();
        r.diiArr(a,b);
        r.sameArr(a);



    }
}
