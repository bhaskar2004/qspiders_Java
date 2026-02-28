package typeCasting;

public class intTolong {

    public static void main(String[] args) {
        int i =234;
        long l = i;//widening , implicit conversion
        System.out.println(i+" "+ l);

        l=(long) i; // widening , explicit
        System.out.println(i+" "+l);
    }
}
