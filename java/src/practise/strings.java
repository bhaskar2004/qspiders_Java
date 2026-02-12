package practise;

public class strings {
    public static void main(String[] args) {
//        String s = "hello";
//        for(int i =s.length()-1;i>=0;i--){
//            System.out.print(s.charAt(i));
//        }

//        String s="malayalam";
//        char[] a=new char[s.length()+1];
//        int couter=0;
//        int j=0;
//        for(int i=s.length()-1;i>=0;i--){
//            a[j]=s.charAt(i);
//            j++;
//        }
//        for(int i=0;i<a.length-1;i++){
//            System.out.println(a[i]);
//        }
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==a[i]){
//                couter++;
//            }
//        }
//        if(couter==s.length()){
//            System.out.println("palindrome");
//        }
//        else {
//            System.out.println("not palindrome");
//        }

        String s="1221";
        boolean pal=true;
        for(int i=0 ;i<=s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                pal=false;
            }
        }
        if(pal){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrom");
        }


    }

}
