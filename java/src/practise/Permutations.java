package practise;

public class Permutations {
    public static void permutaion(String s,String temp){
        if(s.length()==0){
            System.out.println(temp);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            permutaion(s.substring(0,i)+s.substring(i+1),temp+ch);

        }
    }

    public static void main(String[] args) {
        permutaion("abc","");
    }
}
