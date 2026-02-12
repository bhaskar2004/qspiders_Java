package mockPractise;
import java.util.*;
public class vowelConsonent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a chracter");
        char  c=s.next().charAt(0);
        c=Character.toLowerCase(c);
        if(c=='a'|| c=='e'  || c=='i'|| c=='o' || c=='u'){
            System.out.println("its a vowel : "+ c);
        }
        else {
            System.out.println("its  a consonent : "+c);
        }

    }
}
