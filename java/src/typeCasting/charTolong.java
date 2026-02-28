package typeCasting;

public class charTolong {
    public static void main(String[] args) {
        char c = 'a';
        long l =c; // widening , implicit conversion
        System.out.println(c+" "+l);

        l=(long) c;// widening , explicit conversion
        System.out.println(c+" "+l);
    }
}
