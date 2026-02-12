package practise;

public class binarySearch {
    public static int binarysearch(int[]a,int k){
        int low=0;
        int high=a.length-1;
        while (low<=high){
            int mid=(high+low)/2;
            if(a[mid]==k){
                return a[mid];
            } else if (a[mid]<k) {
                high=mid-1;

            }
            else {
                low=mid+1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]a={6,5,3,2,1};
        int k=2;
        int res=binarysearch(a,k);
        System.out.println(res);
    }
}
