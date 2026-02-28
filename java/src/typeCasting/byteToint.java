package typeCasting;

public class byteToint {
    public static void main(String[] args) {
        byte b =10;
        int i=b; // widening , implicit conversion
        System.out.println(b+" "+i);

        i=(int)b; // widening , explicit conversion
        System.out.println(b+" "+i);
    }
}
