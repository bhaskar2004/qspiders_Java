package practise;

public class binary {
     public static void genrate(int n , String s){
         if(s.length()==n){
             System.out.println(s);
             return;
         }
         genrate(n,s+"0");
         genrate(n,s+"1");
     }

    public static void main(String[] args) {
        int n=3;
        genrate(n,"");
    }

}
